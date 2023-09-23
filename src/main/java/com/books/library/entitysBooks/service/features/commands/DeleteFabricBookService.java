package com.books.library.entitysBooks.service.features.commands;

import com.books.library.entitysBooks.persistence.dbcontext.IBookDBContext;
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
