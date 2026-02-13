package com.inventory.bookapi.controller;

import com.inventory.bookapi.entity.Book;
import com.inventory.bookapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book){
        return service.saveBook(book);
    }

    @GetMapping("/all")
    public List<Book> getBooks(){
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable int id){
        return service.getBookById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id){
        return service.deleteBook(id);
    }
}
