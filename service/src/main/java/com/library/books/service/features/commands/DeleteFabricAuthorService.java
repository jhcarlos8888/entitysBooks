package com.library.books.service.features.commands;

import com.library.books.persistence.repository.IAuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteFabricAuthorService {

    private final IAuthorRepository iAuthorRepository;

    public DeleteFabricAuthorService(IAuthorRepository iAuthorRepository) {
        this.iAuthorRepository = iAuthorRepository;
    }

    public void deleteById(Long id){
        iAuthorRepository.deleteById(id);
    }
}
