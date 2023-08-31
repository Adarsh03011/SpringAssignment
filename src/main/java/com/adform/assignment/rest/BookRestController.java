package com.adform.assignment.rest;

import com.adform.assignment.entity.Book;
import com.adform.assignment.exception.ItemNotFoundException;
import com.adform.assignment.services.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assignment")
public class BookRestController {
    private BookService bookService;

    public BookRestController(BookService theBookService){
        bookService = theBookService;
    }

    @GetMapping("/book")
    public List<Book> getAllBook(){
        return bookService.findAll();
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable int id){
        Book book = bookService.findById(id);
        if(book == null){
            throw new ItemNotFoundException("Book not found id: " + id);
        }
        return book;
    }

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book){
        book.setId(0);
        return bookService.save(book);
    }

    @PutMapping("/book")
    public Book updateBook(@RequestBody Book book){
        return bookService.save(book);
    }

    @DeleteMapping("/book/{id}")
    public String deleteBook(@PathVariable int id){
        Book book = bookService.findById(id);
        if(book == null){
            throw new ItemNotFoundException("Book id out of range ");
        }
        bookService.deleteById(id);
        return "Book deleted with id : " + id;
    }




}
