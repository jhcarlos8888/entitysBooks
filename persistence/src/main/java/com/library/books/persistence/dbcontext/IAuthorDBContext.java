package com.library.books.persistence.dbcontext;


import com.library.books.domain.model.EntityAuthor;

import java.util.List;

public interface IAuthorDBContext {

    EntityAuthor saveEntityAuthor(EntityAuthor entityAuthor);
    void deleteEntityAuthorById(Long id);
    List<EntityAuthor> getEntitiesAuthors();
    EntityAuthor getEntityAuthorById(Long id);

}
