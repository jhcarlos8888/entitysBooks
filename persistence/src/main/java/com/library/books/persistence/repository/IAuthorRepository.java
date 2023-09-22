package com.library.books.persistence.repository;

import com.library.books.domain.model.EntityAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface IAuthorRepository extends JpaRepository<EntityAuthor,Long> {
}
