package com.library.books.persistence.repository;

import com.library.books.domain.model.EntityBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<EntityBook,Long> {

}
