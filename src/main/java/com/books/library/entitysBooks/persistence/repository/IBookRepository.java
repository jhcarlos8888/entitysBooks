package com.books.library.entitysBooks.persistence.repository;

import com.books.library.entitysBooks.domain.model.EntityBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<EntityBook,Long> {
}
