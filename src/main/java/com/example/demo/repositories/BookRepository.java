package com.example.demo.repositories;

import com.example.demo.data.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {

   Iterable<Book> findByTitle(String title);
    Iterable<Book> findByAuthorName(String name);
}
