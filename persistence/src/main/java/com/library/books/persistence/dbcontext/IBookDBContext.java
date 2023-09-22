package com.library.books.persistence.dbcontext;

import com.library.books.domain.model.EntityBook;
import java.util.List;


public interface IBookDBContext {

    EntityBook saveEntityBook(EntityBook entityBook);
    void deleteEntityBookById(Long id);
    List<EntityBook> getEntitiesBooks();
    EntityBook getEntityBookById(Long id);
}
