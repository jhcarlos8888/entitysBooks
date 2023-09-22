package com.library.books.service.features.queries;


import com.library.books.domain.dto.BookDTO;
import com.library.books.persistence.repository.IBookRepository;
import com.library.books.service.features.commands.CreateFabricBookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllFabricBookService {

    private final IBookRepository iBookRepository;

    private final CreateFabricBookService createFabricBookService;

    public GetAllFabricBookService(IBookRepository iBookRepository, CreateFabricBookService createFabricBookService) {
        this.iBookRepository = iBookRepository;
        this.createFabricBookService = createFabricBookService;
    }


    public List<BookDTO> findAll(){
        return createFabricBookService.createBooksDTO(iBookRepository.findAll());
    }

    public BookDTO findById(Long id){
        return createFabricBookService.createBookDTO(iBookRepository.findById(id).get());
    }



}
