package com.library.books.service.features.commands;

import com.library.books.persistence.dbcontext.IBookDBContext;
import com.library.books.persistence.repository.IBookRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteFabricBookService {

    private final IBookDBContext iBookDBContext;

    public DeleteFabricBookService(IBookDBContext iBookDBContext) {
        this.iBookDBContext = iBookDBContext;

    }


    public void deleteById(Long id){
        iBookDBContext.deleteEntityBookById(id);
    }
}
