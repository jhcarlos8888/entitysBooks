package com.books.library.entitysBooks.controller;

import com.books.library.entitysBooks.domain.dto.AuthorDTO;
import com.books.library.entitysBooks.service.features.commands.CreateFabricAuthorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/library")
public class AuthorController {
    private final CreateFabricAuthorService createFabricAuthorService;

    public AuthorController(CreateFabricAuthorService createFabricAuthorService) {
        this.createFabricAuthorService = createFabricAuthorService;
    }


    @PostMapping("/author")
    public AuthorDTO createAuthor(@RequestBody AuthorDTO authorDTO){
        return createFabricAuthorService.save(authorDTO);
    }

    @GetMapping("/hellow")
    public String getHellow(){
        return "Hellow";
    }
}
