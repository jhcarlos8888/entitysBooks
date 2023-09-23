package com.books.library.entitysBooks.persistence.dbcontext;

import com.books.library.entitysBooks.domain.model.EntityBook;

import java.util.List;

public interface IBookDBContext {
    EntityBook saveEntityBook(EntityBook entityBook);
    void deleteEntityBookById(Long id);
    List<EntityBook> getEntitiesBooks();
    EntityBook getEntityBookById(Long id);
}
