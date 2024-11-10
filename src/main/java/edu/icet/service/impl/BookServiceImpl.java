package edu.icet.service.impl;

import edu.icet.dto.Book;
import edu.icet.dto.Member;
import edu.icet.entity.BookEntity;
import edu.icet.repository.BookRepository;
import edu.icet.service.BookService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository repository;
    private final ModelMapper mapper;
    @Override
    public void addBook(Book book) {
        repository.save(mapper.map(book, BookEntity.class));
    }

    @Override
    public List<Book> getAll() {
        List<Book> bookArrayList = new ArrayList<>();
        repository.findAll().forEach(entity->{
            bookArrayList.add(mapper.map(entity, Book.class));
        });
        return bookArrayList;
    }

    @Override
    public void deleteBookById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updateBookById(Book book) {
        repository.save(mapper.map(book, BookEntity.class));
    }
}
