package com.books.library.entitysBooks.domain.mapper;

import com.books.library.entitysBooks.domain.dto.BookDTO;
import com.books.library.entitysBooks.domain.model.EntityBook;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class MapperBook {

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
}
