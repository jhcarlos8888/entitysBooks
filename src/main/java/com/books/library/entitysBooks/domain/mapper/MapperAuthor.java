package com.books.library.entitysBooks.domain.mapper;

import com.books.library.entitysBooks.domain.dto.AuthorDTO;
import com.books.library.entitysBooks.domain.model.EntityAuthor;
import lombok.experimental.UtilityClass;
import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class MapperAuthor {

    public EntityAuthor createEntityAuthor(AuthorDTO authorDTO){
        EntityAuthor entityAuthor = new EntityAuthor();
        entityAuthor.setId(authorDTO.getId());
        entityAuthor.setFirstName(authorDTO.getFirstName());
        entityAuthor.setSecondName(authorDTO.getSecondName());
        entityAuthor.setPhone(authorDTO.getPhone());
        return entityAuthor;
    }

    public AuthorDTO createAuthorDTO(EntityAuthor entityAuthor){
        AuthorDTO authorDTO = new AuthorDTO();
        authorDTO.setId(entityAuthor.getId());
        authorDTO.setFirstName(entityAuthor.getFirstName());
        authorDTO.setSecondName(entityAuthor.getSecondName());
        authorDTO.setPhone(entityAuthor.getPhone());
        authorDTO.setBookDTOList(entityAuthor.getEntityBookList() == null ? null :
                MapperBook.createBooksDTO(entityAuthor.getEntityBookList()));
        return authorDTO;
    }


    public List<AuthorDTO> createAuthorsDTO(List<EntityAuthor> entityAuthorList){
        List<AuthorDTO> authorDTOList = new ArrayList<>();

        entityAuthorList.forEach(
                entityAuthor -> {
                    authorDTOList.add(createAuthorDTO(entityAuthor));
                }
        );

        return authorDTOList;
    }
}
