package com.books.library.entitysBooks.service.features.commands;

import com.books.library.entitysBooks.domain.dto.BookDTO;
import com.books.library.entitysBooks.domain.mapper.MapperBook;
import com.books.library.entitysBooks.domain.model.EntityBook;
import com.books.library.entitysBooks.persistence.dbcontext.IBookDBContext;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CreateFabricBookService {
    private final IBookDBContext iBookDBContext;

    public CreateFabricBookService(IBookDBContext iBookDBContext) {
        this.iBookDBContext = iBookDBContext;

    }

    public BookDTO save(BookDTO bookDTO) {
        EntityBook entityBook = iBookDBContext.saveEntityBook(MapperBook.createEntityBook(bookDTO));
        return MapperBook.createBookDTO(entityBook);
    }
}
