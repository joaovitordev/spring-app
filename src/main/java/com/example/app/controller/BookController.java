package com.example.app.controller;

import com.example.app.entity.Book;
import com.example.app.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @PostMapping
    public Book create(@RequestBody Book book) {
        return service.save(book);
    }

    @GetMapping("/{ids}")
    public Book getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping
    public List<Book> getAll() {
        return service.findAll();
    }
}
