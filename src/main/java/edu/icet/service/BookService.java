package edu.icet.service;

import edu.icet.dto.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    List<Book> getAll();
    void deleteBookById(Integer id);
    void updateBookById(Book book);
}
