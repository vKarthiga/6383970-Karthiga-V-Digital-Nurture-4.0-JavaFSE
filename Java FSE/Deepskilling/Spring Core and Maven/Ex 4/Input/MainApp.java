package com.library;

import com.library.controller.BookController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    private static ApplicationContext context;

	public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookController controller = (BookController) context.getBean("bookController");
        controller.handleAddBook();
    }
}
