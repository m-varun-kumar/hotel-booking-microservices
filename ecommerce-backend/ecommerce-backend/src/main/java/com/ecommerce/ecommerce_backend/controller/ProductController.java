package com.ecommerce.ecommerce_backend.controller;


import com.ecommerce.ecommerce_backend.model.Product;
import com.ecommerce.ecommerce_backend.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product add(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }
}
