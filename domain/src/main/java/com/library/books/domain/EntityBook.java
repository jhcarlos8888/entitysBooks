package com.library.books.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntityBook {

    private Long id;
    private String nameBook;
    private String descriptionBook;

}
