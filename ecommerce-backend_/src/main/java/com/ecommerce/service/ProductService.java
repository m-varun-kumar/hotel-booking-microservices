
package com.ecommerce.service;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.model.Product;

@Service
public class ProductService {
 @Autowired ProductRepository repo;
 public List<Product> getAll(){ return repo.findAll(); }
 public Product save(Product p){ return repo.save(p); }
}
