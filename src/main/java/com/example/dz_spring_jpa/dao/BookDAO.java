package com.example.dz_spring_jpa.dao;

import com.example.dz_spring_jpa.model.Book;

import java.util.List;

public interface BookDAO {
    List<Book> getAll();
    Book getById(int id);
    void delete(int id);

    Book update(Book book);

    Book create(Book book);

}
