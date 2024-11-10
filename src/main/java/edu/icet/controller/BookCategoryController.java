package edu.icet.controller;

import edu.icet.dto.Category;
import edu.icet.dto.Member;
import edu.icet.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
@CrossOrigin
public class BookCategoryController {

    @Autowired
    private final CategoryService service;

    @PostMapping("/add-category")
    @ResponseStatus(HttpStatus.CREATED)
    public void addCategory(@RequestBody Category category){
        service.addCategory(category);
        System.out.println(category);
    }
    @GetMapping("/get-all")
    public List<Category> getAll(){
        return service.getAll();
    }
}
