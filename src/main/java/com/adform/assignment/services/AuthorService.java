package com.adform.assignment.services;

import com.adform.assignment.entity.Author;

import java.util.List;

public interface AuthorService {

    List<Author> findAll();

    Author findById(int id);

    Author save(Author author);

    void deleteById(int id);
}
