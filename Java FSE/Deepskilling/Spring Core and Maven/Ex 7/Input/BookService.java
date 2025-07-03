package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private String serviceName;          // Injected via constructor
    private BookRepository bookRepository; // Injected via setter

    // Constructor Injection
    public BookService(String serviceName) {
        this.serviceName = serviceName;
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {
        System.out.println(serviceName + ": Adding a book...");
        bookRepository.save();
    }
}
