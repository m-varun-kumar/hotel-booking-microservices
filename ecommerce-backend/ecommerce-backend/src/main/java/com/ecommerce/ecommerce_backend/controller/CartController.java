package com.ecommerce.ecommerce_backend.controller;

import com.ecommerce.ecommerce_backend.model.AppUser;
import com.ecommerce.ecommerce_backend.model.Cart;
import com.ecommerce.ecommerce_backend.model.Product;
import com.ecommerce.ecommerce_backend.service.CartService;
import com.ecommerce.ecommerce_backend.service.ProductService;
import com.ecommerce.ecommerce_backend.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    private final CartService cartService;
    private final UserService userService;
    private final ProductService productService;

    public CartController(CartService cartService, UserService userService, ProductService productService) {
        this.cartService = cartService;
        this.userService = userService;
        this.productService = productService;
    }

    @PostMapping("/add")
    public Cart addToCart(@RequestParam Long userId, @RequestParam Long productId) {
        AppUser user = userService.getById(userId);
        Product product = productService.getById(productId);
        return cartService.addProduct(user, product);
    }

    @GetMapping("/{userId}")
    public List<Product> getCart(@PathVariable Long userId) {
        AppUser user = userService.getById(userId);
        return cartService.getCartProducts(user);
    }
}
