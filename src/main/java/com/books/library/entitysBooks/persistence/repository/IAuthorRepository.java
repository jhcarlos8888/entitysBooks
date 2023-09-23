package com.books.library.entitysBooks.persistence.repository;

import com.books.library.entitysBooks.domain.model.EntityAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthorRepository extends JpaRepository<EntityAuthor,Long> {
}
