package com.example.library.repository;

import java.util.Arrays;
import java.util.List;

public class BookRepository {

    public List<String> getAllBooks() {
        return Arrays.asList("The Hobbit", "1984", "To Kill a Mockingbird");
    }
}
