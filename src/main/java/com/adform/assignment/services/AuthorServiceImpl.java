package com.adform.assignment.services;

import com.adform.assignment.doa.AuthorRepository;
import com.adform.assignment.entity.Author;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AuthorServiceImpl implements AuthorService{

    AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository theauthorRepository){
        authorRepository = theauthorRepository;
    }
    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author findById(int id) {
        return authorRepository.findById(id).get();
    }

    @Override
    public Author save(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public void deleteById(int id) {
        authorRepository.deleteById(id);

    }
}
