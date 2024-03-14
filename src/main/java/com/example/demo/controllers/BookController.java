package com.example.demo.controllers;

import com.example.demo.data.Book;
import com.example.demo.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/book")
    public Book create(
            @RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/book")
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

    @PostMapping("/search")
    public Iterable<Book> search(@RequestBody Book book) {
        return bookRepository.findByTitle(book.getTitle());
    }

    @GetMapping("/find")
    public Iterable<Book> search(@RequestParam("name") String name) {
        return bookRepository.findByAuthorName(name);
    }
}