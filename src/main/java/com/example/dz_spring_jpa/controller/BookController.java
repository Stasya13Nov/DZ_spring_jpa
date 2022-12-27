package com.example.dz_spring_jpa.controller;

import com.example.dz_spring_jpa.model.Book;
import com.example.dz_spring_jpa.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(BookController.PATH)
@RequiredArgsConstructor
public class BookController {
    public static final String PATH = "/books/";
    private final BookService bookService;

    @GetMapping
    public List<Book> getAll(){
       return bookService.getAll();
    }

    @GetMapping(value = "{id}")
    public Book getById(@PathVariable int id){
        return bookService.getById(id);
    }
    @DeleteMapping(value = "{id}")
    public void delete(@PathVariable int id) {
        bookService.delete(id);
    }

    @PostMapping
    public Book create(@RequestBody Book book) {
        return bookService.create(book);
    }
    @PatchMapping(value = "/update")
    public Book update(@RequestBody Book book) {
       Book bookUp = bookService.update(book);
       return bookUp;
    }
    @GetMapping(value = "search-name")
    public List<Book> getByName(@RequestParam String name){
        return bookService.getByName(name);
    }

}
