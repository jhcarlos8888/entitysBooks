package com.books.library.entitysBooks.service.features.commands;

import com.books.library.entitysBooks.domain.dto.AuthorDTO;
import com.books.library.entitysBooks.domain.mapper.MapperAuthor;
import com.books.library.entitysBooks.domain.model.EntityAuthor;
import com.books.library.entitysBooks.persistence.dbcontext.IAuthorDBContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CreateFabricAuthorService {
    private final IAuthorDBContext iAuthorDBContext;

    public CreateFabricAuthorService(IAuthorDBContext iAuthorDBContext) {
        this.iAuthorDBContext = iAuthorDBContext;
    }


    public AuthorDTO save(AuthorDTO authorDTO) {
        EntityAuthor entityAuthor = iAuthorDBContext.saveEntityAuthor(MapperAuthor.createEntityAuthor(authorDTO));
        return MapperAuthor.createAuthorDTO(entityAuthor);
    }
}
