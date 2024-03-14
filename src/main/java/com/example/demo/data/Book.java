package com.example.demo.data;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy =
            GenerationType.IDENTITY)
    int id;
    String title;
    String isbn;

    @ManyToOne
    Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}