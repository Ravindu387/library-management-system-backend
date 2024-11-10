package edu.icet.service;

import edu.icet.dto.Author;

import java.util.List;

public interface AuthorService {
    void addAuthor(Author author);
    List<Author> getAll();
    void updateAuthor(Author author);
    void deleteAuthorById(Integer id);
}
