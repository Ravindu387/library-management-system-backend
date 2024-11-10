package edu.icet.service.impl;

import edu.icet.dto.Category;
import edu.icet.dto.Member;
import edu.icet.entity.CategoryEntity;
import edu.icet.repository.CategoryRepository;
import edu.icet.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepository repository;
    private final ModelMapper mapper;
    @Override
    public void addCategory(Category category) {
        repository.save(mapper.map(category , CategoryEntity.class));
    }

    @Override
    public List<Category> getAll() {
        List<Category> categoryList = new ArrayList<>();
        repository.findAll().forEach(entity->{
            categoryList.add(mapper.map(entity, Category.class));
        });
        return categoryList;
    }
}
