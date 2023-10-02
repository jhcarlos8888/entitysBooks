package com.books.library.entitysBooks.controller;

import com.books.library.entitysBooks.domain.dto.AuthorDTO;
import com.books.library.entitysBooks.service.features.commands.CreateFabricAuthorService;
import com.books.library.entitysBooks.service.features.queries.GetAllFabricAuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/library")
public class AuthorController {
    private final CreateFabricAuthorService createFabricAuthorService;
    private final GetAllFabricAuthorService getAllFabricAuthorService;

    public AuthorController(CreateFabricAuthorService createFabricAuthorService, GetAllFabricAuthorService getAllFabricAuthorService) {
        this.createFabricAuthorService = createFabricAuthorService;
        this.getAllFabricAuthorService = getAllFabricAuthorService;
    }


    @PostMapping("/author")
    public ResponseEntity<AuthorDTO> createAuthor(@RequestBody AuthorDTO authorDTO){
        return new ResponseEntity<>(createFabricAuthorService.save(authorDTO), HttpStatus.CREATED);
    }

    @GetMapping("/authors")
    public ResponseEntity<List<AuthorDTO>> getAllAuthors(){
        return new ResponseEntity<>(getAllFabricAuthorService.findAll(),HttpStatus.OK);
    }

    @GetMapping("/author/{id}")
    public ResponseEntity<AuthorDTO> getAuthorById(@PathVariable Long id){
        return new ResponseEntity<>(getAllFabricAuthorService.findById(id),HttpStatus.OK);
    }

}
