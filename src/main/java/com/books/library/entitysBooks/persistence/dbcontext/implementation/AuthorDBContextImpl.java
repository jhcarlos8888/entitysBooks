package com.books.library.entitysBooks.persistence.dbcontext.implementation;

import com.books.library.entitysBooks.domain.model.EntityAuthor;
import com.books.library.entitysBooks.persistence.dbcontext.IAuthorDBContext;
import com.books.library.entitysBooks.persistence.repository.IAuthorRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorDBContextImpl implements IAuthorDBContext {
    private final IAuthorRepository iAuthorRepository;

    public AuthorDBContextImpl(IAuthorRepository iAuthorRepository) {
        this.iAuthorRepository = iAuthorRepository;
    }

    @Override
    public EntityAuthor saveEntityAuthor(EntityAuthor entityAuthor) {
        return iAuthorRepository.save(entityAuthor);
    }

    @Override
    public void deleteEntityAuthorById(Long id) {
        iAuthorRepository.deleteById(id);
    }

    @Override
    public List<EntityAuthor> getEntitiesAuthors() {
        return iAuthorRepository.findAll();
    }

    @Override
    public EntityAuthor getEntityAuthorById(Long id) {
        return iAuthorRepository.findById(id).get();
    }
}
