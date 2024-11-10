package edu.icet.service;

import edu.icet.dto.Category;

import java.util.List;

public interface CategoryService {
    void addCategory(Category category);
    List<Category> getAll();
}
