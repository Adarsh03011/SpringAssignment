package com.adform.assignment.rest;

import com.adform.assignment.entity.Author;
import com.adform.assignment.entity.Book;
import com.adform.assignment.exception.ItemNotFoundException;
import com.adform.assignment.services.AuthorService;
import com.adform.assignment.services.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assignment")
public class AuthorRestController {
    private AuthorService authorService;

    public AuthorRestController(AuthorService theAuthorService){
        authorService = theAuthorService;
    }

    @GetMapping("/author")
    public List<Author> getAllAuthor(){
        return authorService.findAll();
    }

    @GetMapping("/author/{id}")
    public Author getAuthor(@PathVariable int id){
        Author author = authorService.findById(id);
        if(author == null){
            throw new ItemNotFoundException("Author not found id: " + id);
        }
        return author;
    }

    @PostMapping("/author")
    public Author addAuthor(@RequestBody Author author){
        author.setId(0);
        return authorService.save(author);
    }

    @PutMapping("/author")
    public Author updateAuthor(@RequestBody Author author){
        return authorService.save(author);
    }

    @DeleteMapping("/author/{id}")
    public String deleteAuthor(@PathVariable int id){
        Author author = authorService.findById(id);
        if(author == null){
            throw new ItemNotFoundException("Author id out of range ");
        }
        authorService.deleteById(id);
        return "Author deleted with id : " + id;
    }
}
