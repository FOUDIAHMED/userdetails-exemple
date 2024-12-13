package com.example.userdetails.service;

import com.example.userdetails.entity.Book;

import java.util.List;

public interface BookInterface {
    List<Book> getBooks();
    Book getBook(Long id);
    Book addBook(Book book);
    Book updateBook(Book book);
    void deleteBook(Long id);

}
