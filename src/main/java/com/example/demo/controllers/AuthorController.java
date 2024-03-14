package com.example.demo.controllers;

import com.example.demo.data.Author;
import com.example.demo.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {
    @Autowired
    private AuthorRepository authorRepository;

    @PostMapping("/author")
    public Author create(
            @RequestBody Author author) {
        return authorRepository.save(author);
    }

    @GetMapping("/author")
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
