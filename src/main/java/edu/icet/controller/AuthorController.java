package edu.icet.controller;

import edu.icet.dto.Author;
import edu.icet.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
@RequiredArgsConstructor
@CrossOrigin
public class AuthorController {
    @Autowired
    private final AuthorService service;

    @PostMapping("/add-author")
    @ResponseStatus(HttpStatus.CREATED)
    public void addAuthor(@RequestBody Author author){
        service.addAuthor(author);
        System.out.println(author);
    }
    @GetMapping("/get-all")
    public List<Author> getAll(){
        return service.getAll();
    }
    @PutMapping("/update-author")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateAuthor(@RequestBody Author author){
        service.updateAuthor(author);
    }
    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteAuthorById(@PathVariable Integer id){
        service.deleteAuthorById(id);
    }
}
