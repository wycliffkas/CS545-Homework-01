package org.example.homework01.controllers;

import org.example.homework01.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getBooks() {
        return Arrays.asList(
                new Book(1, "Spring in Action", "123456789"),
                new Book(2, "Effective Java", "987654321"),
                new Book(3, "Clean Code", "123123123")
        );
    }
}
