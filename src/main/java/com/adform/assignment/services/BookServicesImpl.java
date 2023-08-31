package com.adform.assignment.services;

import com.adform.assignment.doa.BookRepository;
import com.adform.assignment.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookServicesImpl implements BookService {

    BookRepository bookRepository;

    @Autowired
    public BookServicesImpl(BookRepository theBookRepository){
        bookRepository = theBookRepository;
    }
    @Override
    public List<Book> findAll() {
       return bookRepository.findAll();
    }

    @Override
    public Book findById(int id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteById(int id) {
        bookRepository.deleteById(id);
    }
}
