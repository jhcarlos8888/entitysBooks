package com.library.books.domain.dto;


import com.library.books.domain.model.EntityBook;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
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


    public BookDTO(EntityBook entityBook) {
        this.id = entityBook.getId();
        this.isbn = entityBook.getIsbn();
        this.nameBook = entityBook.getNameBook();
        this.editorial = entityBook.getEditorial();
        this.gender = entityBook.getGender();
        this.numberOfPage = entityBook.getNumberOfPage();
        this.price = entityBook.getPrice();
        this.dateOfEdition = entityBook.getDateOfEdition();
        this.authorDTO = new AuthorDTO(entityBook.getAuthor());
    }
}
