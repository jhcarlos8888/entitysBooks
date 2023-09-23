package com.books.library.entitysBooks.persistence.dbcontext;

import com.books.library.entitysBooks.domain.model.EntityAuthor;

import java.util.List;

public interface IAuthorDBContext {
    EntityAuthor saveEntityAuthor(EntityAuthor entityAuthor);
    void deleteEntityAuthorById(Long id);
    List<EntityAuthor> getEntitiesAuthors();
    EntityAuthor getEntityAuthorById(Long id);
}
