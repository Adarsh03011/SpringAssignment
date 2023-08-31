package com.adform.assignment.services;

import com.adform.assignment.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();

    Book findById(int id);

    Book save(Book book);

    void deleteById(int id);
}
