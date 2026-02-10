package com.ecommerce.ecommerce_backend.controller;


import com.ecommerce.ecommerce_backend.model.Category;
import com.ecommerce.ecommerce_backend.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public Category add(@RequestBody Category category) {
        return categoryService.save(category);
    }

    @GetMapping
    public List<Category> getAll() {
        return categoryService.getAll();
    }
}
