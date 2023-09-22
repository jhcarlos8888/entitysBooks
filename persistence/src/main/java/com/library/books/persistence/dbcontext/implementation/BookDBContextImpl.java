package com.library.books.persistence.dbcontext.implementation;

import com.library.books.domain.model.EntityBook;
import com.library.books.persistence.dbcontext.IBookDBContext;
import com.library.books.persistence.repository.IBookRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookDBContextImpl implements IBookDBContext {

    private final IBookRepository iBookRepository;

    public BookDBContextImpl(IBookRepository iBookRepository) {
        this.iBookRepository = iBookRepository;
    }

    @Override
    public EntityBook saveEntityBook(EntityBook entityBook) {
        return iBookRepository.save(entityBook);
    }

    @Override
    public void deleteEntityBookById(Long id) {
        iBookRepository.deleteById(id);
    }

    @Override
    public List<EntityBook> getEntitiesBooks() {
        return iBookRepository.findAll();
    }

    @Override
    public EntityBook getEntityBookById(Long id) {
        return iBookRepository.findById(id).get();
    }
}
