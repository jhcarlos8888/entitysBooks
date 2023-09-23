package com.books.library.entitysBooks.service.features.commands;

import com.books.library.entitysBooks.persistence.dbcontext.IAuthorDBContext;
import org.springframework.stereotype.Service;

@Service
public class DeleteFabricAuthorService {
    private final IAuthorDBContext iAuthorDBContext;

    public DeleteFabricAuthorService(IAuthorDBContext iAuthorDBContext) {
        this.iAuthorDBContext = iAuthorDBContext;
    }

    public void deleteById(Long id){
        iAuthorDBContext.deleteEntityAuthorById(id);
    }
}
