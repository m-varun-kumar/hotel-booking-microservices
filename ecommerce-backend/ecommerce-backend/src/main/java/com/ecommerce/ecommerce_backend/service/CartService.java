package com.ecommerce.ecommerce_backend.service;

import com.ecommerce.ecommerce_backend.model.AppUser;
import com.ecommerce.ecommerce_backend.model.Cart;
import com.ecommerce.ecommerce_backend.model.Product;
import com.ecommerce.ecommerce_backend.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart addProduct(AppUser user, Product product) {
        Cart cart = cartRepository.findByUser(user).orElseGet(() -> {
            Cart c = new Cart();
            c.setUser(user);
            return c;
        });
        cart.getProducts().add(product);
        return cartRepository.save(cart);
    }

    public List<Product> getCartProducts(AppUser user) {
        return cartRepository.findByUser(user).map(Cart::getProducts).orElse(List.of());
    }
}
