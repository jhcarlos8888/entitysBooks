package com.books.library.entitysBooks.service.features.queries;

import com.books.library.entitysBooks.domain.dto.AuthorDTO;
import com.books.library.entitysBooks.domain.mapper.MapperAuthor;
import com.books.library.entitysBooks.persistence.dbcontext.IAuthorDBContext;
import com.books.library.entitysBooks.service.features.commands.CreateFabricAuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllFabricAuthorService {
    private final IAuthorDBContext iAuthorDBContext;


    public GetAllFabricAuthorService(IAuthorDBContext iAuthorDBContext) {
        this.iAuthorDBContext = iAuthorDBContext;

    }

    public List<AuthorDTO> findAll(){

        return MapperAuthor.createAuthorsDTO(iAuthorDBContext.getEntitiesAuthors());
    }

    public AuthorDTO findById(Long id){
        return MapperAuthor.createAuthorDTO(iAuthorDBContext.getEntityAuthorById(id));
    }
}
