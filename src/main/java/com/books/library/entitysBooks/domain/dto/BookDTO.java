package com.books.library.entitysBooks.domain.dto;

import com.books.library.entitysBooks.domain.mapper.MapperAuthor;
import com.books.library.entitysBooks.domain.model.EntityBook;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class BookDTO {
    private Long id;
    private String isbn;
    private String nameBook;
    private String editorial;
    private String gender;
    private int numberOfPage;
    private BigDecimal price;
    private LocalDate dateOfEdition;
    private AuthorDTO authorDTO;
    private Long idAuthor;


    public BookDTO(EntityBook entityBook) {
        this.id = entityBook.getId();
        this.isbn = entityBook.getIsbn();
        this.nameBook = entityBook.getNameBook();
        this.editorial = entityBook.getEditorial();
        this.gender = entityBook.getGender();
        this.numberOfPage = entityBook.getNumberOfPage();
        this.price = entityBook.getPrice();
        this.dateOfEdition = entityBook.getDateOfEdition();
       // this.authorDTO = new AuthorDTO(entityBook.getAuthor());
    }
}
