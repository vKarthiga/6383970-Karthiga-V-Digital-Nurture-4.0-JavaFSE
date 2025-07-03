package com.library.controller;

import com.library.service.BookService;

public class BookController {
    private BookService bookService;

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    public void handleAddBook() {
        System.out.println("Controller: Adding a book");
        bookService.addBook();
    }
}
