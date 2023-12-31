package com.books.library.entitysBooks.service.features.commands;

import com.books.library.entitysBooks.domain.dto.BookDTO;
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

    public EntityBook createEntityBook(BookDTO bookDTO){
        return new EntityBook(bookDTO);
    }

    public BookDTO createBookDTO(EntityBook entityBook){
        return new BookDTO(entityBook);
    }


    public List<BookDTO> createBooksDTO(List<EntityBook> entityBookList){
        List<BookDTO> bookDTOList = new ArrayList<>();

        entityBookList.forEach(
                entityBook -> {
                    bookDTOList.add(createBookDTO(entityBook));
                }
        );

        return bookDTOList;
    }

    public BookDTO save(BookDTO bookDTO) {
        EntityBook entityBook = iBookDBContext.saveEntityBook(createEntityBook(bookDTO));
        return createBookDTO(entityBook);
    }
}
