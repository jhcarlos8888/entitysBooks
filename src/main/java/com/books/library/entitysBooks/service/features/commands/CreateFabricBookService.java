package com.books.library.entitysBooks.service.features.commands;

import com.books.library.entitysBooks.domain.dto.BookDTO;
import com.books.library.entitysBooks.domain.mapper.MapperAuthor;
import com.books.library.entitysBooks.domain.mapper.MapperBook;
import com.books.library.entitysBooks.domain.model.EntityAuthor;
import com.books.library.entitysBooks.domain.model.EntityBook;
import com.books.library.entitysBooks.persistence.dbcontext.IAuthorDBContext;
import com.books.library.entitysBooks.persistence.dbcontext.IBookDBContext;
import org.springframework.stereotype.Service;

@Service
public class CreateFabricBookService {
    private final IBookDBContext iBookDBContext;
    private final IAuthorDBContext iAuthorDBContext;

    public CreateFabricBookService(IBookDBContext iBookDBContext, IAuthorDBContext iAuthorDBContext) {
        this.iBookDBContext = iBookDBContext;
        this.iAuthorDBContext = iAuthorDBContext;
    }

    public BookDTO save(BookDTO bookDTO) {
        //Find author by id
        EntityAuthor entityAuthor = iAuthorDBContext.getEntityAuthorById(bookDTO.getIdAuthor());
        bookDTO.setAuthorDTO(MapperAuthor.createAuthorDTO(entityAuthor));

        EntityBook entityBook = iBookDBContext.saveEntityBook(MapperBook.createEntityBook(bookDTO));
        return MapperBook.createBookDTO(entityBook);
    }
}
