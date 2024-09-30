package org.example.homework01.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
    private int id;
    private String title;
    private String isbn;
}
