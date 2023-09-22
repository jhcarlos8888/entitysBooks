package com.library.books.presentation.controllers;



import com.library.books.domain.dto.AuthorDTO;
import com.library.books.service.features.commands.CreateFabricAuthorService;
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


}
