package com.library.books.service.features.queries;

import com.library.books.domain.dto.AuthorDTO;
import com.library.books.persistence.repository.IAuthorRepository;
import com.library.books.service.features.commands.CreateFabricAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetAllFabricAuthorService {

    private final IAuthorRepository iAuthorRepository;

    private final CreateFabricAuthorService createFabricAuthorService;

    public GetAllFabricAuthorService(IAuthorRepository iAuthorRepository, CreateFabricAuthorService createFabricAuthorService) {
        this.iAuthorRepository = iAuthorRepository;
        this.createFabricAuthorService = createFabricAuthorService;
    }

    public List<AuthorDTO> findAll(){

        return createFabricAuthorService.createAuthorsDTO(iAuthorRepository.findAll());
    }

    public AuthorDTO findById(Long id){
        return createFabricAuthorService.createAuthorDTO(iAuthorRepository.findById(id).get());
    }
}
