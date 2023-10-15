package com.books.library.entitysBooks.domain.dto;

import com.books.library.entitysBooks.domain.mapper.MapperBook;
import com.books.library.entitysBooks.domain.model.EntityAuthor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class AuthorDTO {
    private Long id;
    private String firstName;
    private String secondName;
    private String phone;
    private List<BookDTO> bookDTOList;


    public AuthorDTO(EntityAuthor entityAuthor) {
        this.id = entityAuthor.getId();
        this.firstName = entityAuthor.getFirstName();
        this.secondName = entityAuthor.getSecondName();
        this.phone = entityAuthor.getPhone();
        this.bookDTOList = MapperBook.createBooksDTO(entityAuthor.getEntityBookList());
    }
}
