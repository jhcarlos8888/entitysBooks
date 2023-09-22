package com.library.books.service.features.commands;

import com.library.books.persistence.repository.IBookRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteFabricBookService {

    private final IBookRepository iBookRepository;

    public DeleteFabricBookService(IBookRepository iBookRepository) {
        this.iBookRepository = iBookRepository;
    }


    public void deleteById(Long id){
        iBookRepository.deleteById(id);
    }
}
