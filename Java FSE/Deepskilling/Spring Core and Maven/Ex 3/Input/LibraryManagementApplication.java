package com.example.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.library.service.BookService;

public class LibraryManagementApplication {

    private static ApplicationContext context;

	public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = (BookService) context.getBean("bookService");
        bookService.listBooks();  // this method call will be logged
    }
}
