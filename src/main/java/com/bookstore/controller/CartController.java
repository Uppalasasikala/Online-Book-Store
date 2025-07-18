package com.bookstore.controller;

import com.bookstore.model.Book;
import com.bookstore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/{userId}")
    public ResponseEntity<List<Book>> getCartByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(cartService.getCartByUserId(userId));
    }

    @PostMapping("/{userId}/add")
    public ResponseEntity<String> addToCart(@PathVariable Long userId, @RequestBody Book book) {
        cartService.addToCart(userId, book);
        return ResponseEntity.ok("Book added to cart");
    }

    @DeleteMapping("/{userId}/remove/{bookId}")
    public ResponseEntity<String> removeFromCart(@PathVariable Long userId, @PathVariable Long bookId) {
        cartService.removeFromCart(userId, bookId);
        return ResponseEntity.ok("Book removed from cart");
    }

    @DeleteMapping("/{userId}/clear")
    public ResponseEntity<String> clearCart(@PathVariable Long userId) {
        cartService.clearCart(userId);
        return ResponseEntity.ok("Cart cleared");
    }
}