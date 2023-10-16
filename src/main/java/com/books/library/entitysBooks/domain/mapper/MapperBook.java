package com.books.library.entitysBooks.domain.mapper;

import com.books.library.entitysBooks.domain.dto.BookDTO;
import com.books.library.entitysBooks.domain.model.EntityBook;
import lombok.experimental.UtilityClass;
import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class MapperBook {

    public EntityBook createEntityBook(BookDTO bookDTO){
        EntityBook entityBook = new EntityBook();
        entityBook.setId(bookDTO.getId());
        entityBook.setIsbn(bookDTO.getIsbn());
        entityBook.setNameBook(bookDTO.getNameBook());
        entityBook.setEditorial(bookDTO.getEditorial());
        entityBook.setGender(bookDTO.getGender());
        entityBook.setNumberOfPage(bookDTO.getNumberOfPage());
        entityBook.setPrice(bookDTO.getPrice());
        entityBook.setDateOfEdition(bookDTO.getDateOfEdition());
        entityBook.setAuthor(MapperAuthor.createEntityAuthor(bookDTO.getAuthorDTO()));
        return entityBook;
    }

    public BookDTO createBookDTO(EntityBook entityBook){

        BookDTO bookDTO = new BookDTO();
        bookDTO.setId(entityBook.getId());
        bookDTO.setIsbn(entityBook.getIsbn());
        bookDTO.setNameBook(entityBook.getNameBook());
        bookDTO.setEditorial(entityBook.getEditorial());
        bookDTO.setGender(entityBook.getGender());
        bookDTO.setNumberOfPage(entityBook.getNumberOfPage());
        bookDTO.setPrice(entityBook.getPrice());
        bookDTO.setDateOfEdition(entityBook.getDateOfEdition());
        bookDTO.setIdAuthor(entityBook.getAuthor().getId());
      //  bookDTO.setAuthorDTO(MapperAuthor.createAuthorDTO(entityBook.getAuthor()));
        return bookDTO;

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
