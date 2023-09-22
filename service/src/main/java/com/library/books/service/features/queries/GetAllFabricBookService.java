package com.library.books.service.features.queries;


import com.library.books.domain.dto.BookDTO;
import com.library.books.persistence.dbcontext.IBookDBContext;
import com.library.books.persistence.repository.IBookRepository;
import com.library.books.service.features.commands.CreateFabricBookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllFabricBookService {

    private final IBookDBContext iBookDBContext;

    private final CreateFabricBookService createFabricBookService;

    public GetAllFabricBookService(IBookDBContext iBookDBContext, CreateFabricBookService createFabricBookService) {
        this.iBookDBContext = iBookDBContext;
        this.createFabricBookService = createFabricBookService;
    }


    public List<BookDTO> findAll(){
        return createFabricBookService.createBooksDTO(iBookDBContext.getEntitiesBooks());
    }

    public BookDTO findById(Long id){
        return createFabricBookService.createBookDTO(iBookDBContext.getEntityBookById(id));
    }



}
