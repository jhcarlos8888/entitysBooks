package com.books.library.entitysBooks.service.features.queries;

import com.books.library.entitysBooks.domain.dto.BookDTO;
import com.books.library.entitysBooks.domain.mapper.MapperBook;
import com.books.library.entitysBooks.persistence.dbcontext.IBookDBContext;
import com.books.library.entitysBooks.service.features.commands.CreateFabricBookService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GetAllFabricBookService {
    private final IBookDBContext iBookDBContext;

    public GetAllFabricBookService(IBookDBContext iBookDBContext) {
        this.iBookDBContext = iBookDBContext;

    }


    public List<BookDTO> findAll(){
        return MapperBook.createBooksDTO(iBookDBContext.getEntitiesBooks());
    }

    public BookDTO findById(Long id){
        return MapperBook.createBookDTO(iBookDBContext.getEntityBookById(id));
    }
}
