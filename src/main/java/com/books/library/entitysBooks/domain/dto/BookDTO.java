package com.books.library.entitysBooks.domain.dto;

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

}
