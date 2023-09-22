package com.library.books.domain.model;


import com.library.books.domain.dto.AuthorDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "authors")
public class EntityAuthor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "second_name")
    private String secondName;
    @Column(name = "phone")
    private String phone;

    public EntityAuthor(AuthorDTO authorDTO) {
        this.id = authorDTO.getId();
        this.firstName = authorDTO.getFirstName();
        this.secondName = authorDTO.getSecondName();
        this.phone = authorDTO.getPhone();
    }
}
