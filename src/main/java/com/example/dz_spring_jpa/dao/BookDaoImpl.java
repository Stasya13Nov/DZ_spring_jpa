package com.example.dz_spring_jpa.dao;

import com.example.dz_spring_jpa.model.Book;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Queue;

@Repository
public class BookDaoImpl implements BookDAO{
    private static final String GET_ALL = "SELECT b FROM Book b";
    private static final String GET_BY_NAME = "SELECT b FROM Book b WHERE b.name = :name";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Book> getAll() {
        Query query = entityManager.createQuery(GET_ALL);
        return query.getResultList();
    }

    @Override
    public Book getById(int id) {
        return entityManager.find(Book.class, id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Book book = entityManager.find(Book.class, id);
        entityManager.remove(book);
        entityManager.flush();
    }


    @Override
    @Transactional
    public void save(Book book) {
        Book newBook = entityManager.merge(book);
        book.setId(newBook.getId());
    }

    @Override
    public List<Book> getByName(String name) {
        Query query = entityManager.createQuery(GET_BY_NAME);
        query.setParameter("name", name);
        return query.getResultList();
    }
}
