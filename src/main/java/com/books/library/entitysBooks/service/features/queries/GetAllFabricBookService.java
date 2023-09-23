package com.books.library.entitysBooks.service.features.queries;

import com.books.library.entitysBooks.domain.dto.BookDTO;
import com.books.library.entitysBooks.persistence.dbcontext.IBookDBContext;
import com.books.library.entitysBooks.service.features.commands.CreateFabricBookService;
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
