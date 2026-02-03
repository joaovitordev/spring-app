package com.example.app.service;

import com.example.app.entity.Book;
import com.example.app.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public Book save(Book book) {
        return repository.save(book);
    }

    public Book findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public List<Book> findAll() {
        return repository.findAll();
    }
}
