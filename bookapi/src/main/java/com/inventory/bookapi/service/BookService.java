package com.inventory.bookapi.service;

import com.inventory.bookapi.entity.Book;
import com.inventory.bookapi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public Book saveBook(Book book){
        return repository.save(book);
    }

    public List<Book> getAllBooks(){
        return repository.findAll();
    }

    public Book getBookById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteBook(int id){
        repository.deleteById(id);
        return "Book Deleted Successfully";
    }
}
