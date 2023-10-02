package com.books.library.entitysBooks.domain.mapper;

import com.books.library.entitysBooks.domain.dto.AuthorDTO;
import com.books.library.entitysBooks.domain.model.EntityAuthor;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class MapperAuthor {

    public EntityAuthor createEntityAuthor(AuthorDTO authorDTO){
        return new EntityAuthor(authorDTO);
    }

    public AuthorDTO createAuthorDTO(EntityAuthor entityAuthor){
        return new AuthorDTO(entityAuthor);
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
