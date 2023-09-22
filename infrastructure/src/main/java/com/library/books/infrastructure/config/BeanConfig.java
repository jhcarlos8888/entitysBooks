package com.library.books.infrastructure.config;

import com.library.books.persistence.dbcontext.IAuthorDBContext;
import com.library.books.persistence.dbcontext.implementation.AuthorDBContextImpl;
import com.library.books.persistence.repository.IAuthorRepository;
import com.library.books.service.features.commands.CreateFabricAuthorService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.library.books.persistence.repository"})
public class BeanConfig {

    @Bean
    public CreateFabricAuthorService createFabricAuthorService (IAuthorDBContext iAuthorDBContext){
        return new CreateFabricAuthorService(iAuthorDBContext);
    }

    @Bean
    public IAuthorDBContext iAuthorDBContext(IAuthorRepository iAuthorRepository) {
        return new AuthorDBContextImpl(iAuthorRepository);
    }

}
