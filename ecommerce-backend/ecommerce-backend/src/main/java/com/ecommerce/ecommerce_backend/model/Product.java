package com.ecommerce.ecommerce_backend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private BigDecimal price;
    private int stock;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}