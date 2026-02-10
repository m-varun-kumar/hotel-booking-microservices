package com.ecommerce.ecommerce_backend.service;


import com.ecommerce.ecommerce_backend.model.Category;
import com.ecommerce.ecommerce_backend.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
}
