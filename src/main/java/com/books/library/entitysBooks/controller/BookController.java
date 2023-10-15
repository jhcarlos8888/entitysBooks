package com.books.library.entitysBooks.controller;


import com.books.library.entitysBooks.domain.dto.BookDTO;
import com.books.library.entitysBooks.service.features.commands.CreateFabricBookService;
import com.books.library.entitysBooks.service.features.commands.DeleteFabricBookService;
import com.books.library.entitysBooks.service.features.queries.GetAllFabricBookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/library")
public class BookController {
    private final CreateFabricBookService createFabricBookService;
    private final GetAllFabricBookService getAllFabricBookService;
    private final DeleteFabricBookService deleteFabricBookService;

    public BookController(CreateFabricBookService createFabricBookService,
                          GetAllFabricBookService getAllFabricBookService,
                          DeleteFabricBookService deleteFabricBookService) {
        this.createFabricBookService = createFabricBookService;
        this.getAllFabricBookService = getAllFabricBookService;
        this.deleteFabricBookService = deleteFabricBookService;
    }

    @PostMapping("/book")
    public ResponseEntity<BookDTO> createBook(@RequestBody BookDTO bookDTO){
        try{
            return new ResponseEntity<>(createFabricBookService.save(bookDTO), HttpStatus.CREATED);
        }catch (Exception e){
             return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/books")
    public ResponseEntity<List<BookDTO>> getAllBooks(){
        try {
            return new ResponseEntity<>(getAllFabricBookService.findAll(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/book/{id}")
    public ResponseEntity<BookDTO> getBookById(@PathVariable Long id){
        try{
            return new ResponseEntity<>(getAllFabricBookService.findById(id),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/book/{id}")
    public ResponseEntity<HttpStatus>deleteBookById(@PathVariable Long id){
        try{
            deleteFabricBookService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
