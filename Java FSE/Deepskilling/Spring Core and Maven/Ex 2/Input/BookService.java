package com.example.library.service;

import com.example.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void listBooks() {
        bookRepository.getAllBooks().forEach(System.out::println);
    }
}
