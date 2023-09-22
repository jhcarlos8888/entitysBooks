package com.library.books.service.features.commands;


import com.library.books.domain.dto.BookDTO;
import com.library.books.domain.model.EntityBook;
import com.library.books.persistence.repository.IBookRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CreateFabricBookService {

    private final IBookRepository iBookRepository;

    public CreateFabricBookService(IBookRepository iBookRepository) {
        this.iBookRepository = iBookRepository;
    }

    public EntityBook createEntityBook(BookDTO bookDTO){
        return new EntityBook(bookDTO);
    }

    public BookDTO createBookDTO(EntityBook entityBook){
        return new BookDTO(entityBook);
    }


    public List<BookDTO> createBooksDTO(List<EntityBook> entityBookList){
        List<BookDTO> bookDTOList = new ArrayList<>();

        entityBookList.forEach(
                entityBook -> {
                    bookDTOList.add(createBookDTO(entityBook));
                }
        );

        return bookDTOList;
    }

    public BookDTO save(BookDTO bookDTO) {
        EntityBook entityBook = iBookRepository.save(createEntityBook(bookDTO));
        return createBookDTO(entityBook);
    }


}
