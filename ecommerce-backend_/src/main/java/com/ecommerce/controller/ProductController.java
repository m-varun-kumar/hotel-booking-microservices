
package com.ecommerce.controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.ecommerce.service.ProductService;
import com.ecommerce.model.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {
 @Autowired ProductService service;

 @GetMapping
 public List<Product> all(){ return service.getAll(); }

 @PostMapping
 public Product save(@RequestBody Product p){ return service.save(p); }
}
