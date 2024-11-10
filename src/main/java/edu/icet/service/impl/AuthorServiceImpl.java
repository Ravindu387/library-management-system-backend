package edu.icet.service.impl;

import edu.icet.dto.Author;
import edu.icet.dto.Member;
import edu.icet.entity.AuthorEntity;
import edu.icet.repository.AuthorRepository;
import edu.icet.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository repository;
    private final ModelMapper mapper;
    @Override
    public void addAuthor(Author author) {
        repository.save(mapper.map(author, AuthorEntity.class));
    }

    @Override
    public List<Author> getAll() {
        List<Author> authorArrayList = new ArrayList<>();
        repository.findAll().forEach(entity->{
            authorArrayList.add(mapper.map(entity, Author.class));
        });
        return authorArrayList;
    }

    @Override
    public void updateAuthor(Author author) {
        repository.save(mapper.map(author, AuthorEntity.class));
    }

    @Override
    public void deleteAuthorById(Integer id) {
        repository.deleteById(id);
    }
}
