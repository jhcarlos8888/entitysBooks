package com.books.library.entitysBooks.domain.dto;

import com.books.library.entitysBooks.domain.model.EntityAuthor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthorDTO {
    private Long id;
    private String firstName;
    private String secondName;
    private String phone;

    public AuthorDTO(EntityAuthor entityAuthor) {
        this.id = entityAuthor.getId();
        this.firstName = entityAuthor.getFirstName();
        this.secondName = entityAuthor.getSecondName();
        this.phone = entityAuthor.getPhone();
    }
}
