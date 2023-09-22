package com.library.books.service.features.commands;

import com.library.books.persistence.dbcontext.IAuthorDBContext;
import com.library.books.persistence.repository.IAuthorRepository;
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
