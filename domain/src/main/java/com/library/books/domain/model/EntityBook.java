package com.library.books.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class EntityBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String isbn;
    private String nameBook;
    private String editorial;
    private String gender;
    private int numberOfPage;
    private BigDecimal price;
    private LocalDate dateOfEdition;
    @ManyToOne
    private EntityAuthor author;

}
