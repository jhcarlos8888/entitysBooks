package com.library.books.service.features.commands;

import com.library.books.domain.dto.AuthorDTO;
import com.library.books.domain.model.EntityAuthor;
import com.library.books.persistence.dbcontext.IAuthorDBContext;
import com.library.books.persistence.repository.IAuthorRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CreateFabricAuthorService {

    private final IAuthorDBContext iAuthorDBContext;

    public CreateFabricAuthorService(IAuthorDBContext iAuthorDBContext) {
        this.iAuthorDBContext = iAuthorDBContext;
    }

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


    public AuthorDTO save(AuthorDTO authorDTO) {
        EntityAuthor entityAuthor = iAuthorDBContext.saveEntityAuthor(createEntityAuthor(authorDTO));
        return createAuthorDTO(entityAuthor);
    }


}
