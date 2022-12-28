package com.example.dz_spring_jpa.dao;

import com.example.dz_spring_jpa.model.Book;

import java.util.List;

public interface BookDAO {
    List<Book> getAll();
    Book getById(int id);
    public void delete(int id);

    public void save(Book book); //create and update
    List<Book> getByName(String name);

}
