package com.books.library.entitysBooks.controller;

import com.books.library.entitysBooks.domain.dto.AuthorDTO;
import com.books.library.entitysBooks.service.features.commands.CreateFabricAuthorService;
import com.books.library.entitysBooks.service.features.commands.DeleteFabricAuthorService;
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
    private final DeleteFabricAuthorService deleteFabricAuthorService;


    public AuthorController(CreateFabricAuthorService createFabricAuthorService,
                            GetAllFabricAuthorService getAllFabricAuthorService,
                            DeleteFabricAuthorService deleteFabricAuthorService) {
        this.createFabricAuthorService = createFabricAuthorService;
        this.getAllFabricAuthorService = getAllFabricAuthorService;
        this.deleteFabricAuthorService = deleteFabricAuthorService;
    }


    @PostMapping("/author")
    public ResponseEntity<AuthorDTO> createAuthor(@RequestBody AuthorDTO authorDTO){
        try{
            return new ResponseEntity<>(createFabricAuthorService.save(authorDTO), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/authors")
    public ResponseEntity<List<AuthorDTO>> getAllAuthors(){
        try {
            return new ResponseEntity<>(getAllFabricAuthorService.findAll(),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/author/{id}")
    public ResponseEntity<AuthorDTO> getAuthorById(@PathVariable Long id){
        try{
            return new ResponseEntity<>(getAllFabricAuthorService.findById(id),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/author/{id}")
    public ResponseEntity<HttpStatus>deleteAuthorById(@PathVariable Long id){
        try{
            deleteFabricAuthorService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



}
