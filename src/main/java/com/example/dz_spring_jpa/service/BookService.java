package com.example.dz_spring_jpa.service;

import com.example.dz_spring_jpa.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();

    Book getById(int id);
    void delete(int id);

    Book update(Book book);

    Book create(Book book);
}
