package com.example.dz_spring_jpa.service;

import com.example.dz_spring_jpa.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();

    Book getById(int id);
    public void delete(int id);

    public void save(Book book); //create and update
    List<Book> getByName(String name);
}
