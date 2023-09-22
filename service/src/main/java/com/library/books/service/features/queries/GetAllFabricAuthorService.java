package com.library.books.service.features.queries;

import com.library.books.domain.dto.AuthorDTO;
import com.library.books.persistence.dbcontext.IAuthorDBContext;
import com.library.books.persistence.repository.IAuthorRepository;
import com.library.books.service.features.commands.CreateFabricAuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllFabricAuthorService {

    private final IAuthorDBContext iAuthorDBContext;

    private final CreateFabricAuthorService createFabricAuthorService;

    public GetAllFabricAuthorService(IAuthorDBContext iAuthorDBContext, CreateFabricAuthorService createFabricAuthorService) {
        this.iAuthorDBContext = iAuthorDBContext;
        this.createFabricAuthorService = createFabricAuthorService;
    }

    public List<AuthorDTO> findAll(){

        return createFabricAuthorService.createAuthorsDTO(iAuthorDBContext.getEntitiesAuthors());
    }

    public AuthorDTO findById(Long id){
        return createFabricAuthorService.createAuthorDTO(iAuthorDBContext.getEntityAuthorById(id));
    }


}
