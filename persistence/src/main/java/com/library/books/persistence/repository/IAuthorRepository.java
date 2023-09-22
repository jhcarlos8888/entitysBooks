package com.library.books.persistence.repository;

import com.library.books.domain.model.EntityAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthorRepository extends JpaRepository<EntityAuthor,Long> {
}
