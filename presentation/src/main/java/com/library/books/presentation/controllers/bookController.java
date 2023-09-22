package com.library.books.presentation.controllers;


import com.library.books.domain.model.EntityBook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("library")
public class bookController {

    @GetMapping("/book")
    public EntityBook getBook(){
        return new EntityBook(874L,"nameOfBook","descriptionBook");
    }

}
