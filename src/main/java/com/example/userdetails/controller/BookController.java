package com.example.userdetails.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.userdetails.entity.Book;
import com.example.userdetails.service.BookInterface;
import com.example.userdetails.service.BookService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/books")

public class BookController {
    private final BookInterface bookService;

    public BookController(BookInterface bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        System.out.println("getAllBooks");
        return  ResponseEntity.ok(bookService.getBooks()) ;
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id) {

        return bookService.getBook(id);
    }

    @PostMapping
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}

