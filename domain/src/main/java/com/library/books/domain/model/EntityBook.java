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
    @Column(name = "id")
    private Long id;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "name_book")
    private String nameBook;
    @Column(name = "editorial")
    private String editorial;
    @Column(name = "gender")
    private String gender;
    @Column(name = "number_page")
    private int numberOfPage;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "date_edition")
    private LocalDate dateOfEdition;
    @ManyToOne
    @Column(name = "author_id")
    private EntityAuthor author;

}
