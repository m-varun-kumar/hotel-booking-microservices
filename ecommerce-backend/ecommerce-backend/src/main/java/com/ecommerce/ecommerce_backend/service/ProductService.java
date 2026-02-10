package com.ecommerce.ecommerce_backend.service;


import com.ecommerce.ecommerce_backend.model.Product;
import com.ecommerce.ecommerce_backend.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
