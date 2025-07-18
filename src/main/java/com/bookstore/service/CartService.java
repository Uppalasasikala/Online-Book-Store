package com.bookstore.service;

import com.bookstore.model.Cart;
import com.bookstore.model.Book;
import com.bookstore.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public Cart getCartByUserId(Long userId) {
        return cartRepository.findById(userId).orElse(new Cart(userId));
    }

    public void addToCart(Long userId, Book book) {
        Cart cart = getCartByUserId(userId);
        cart.getBooks().add(book);
        cartRepository.save(cart);
    }

    public void removeFromCart(Long userId, Long bookId) {
        Cart cart = getCartByUserId(userId);
        cart.getBooks().removeIf(book -> book.getId().equals(bookId));
        cartRepository.save(cart);
    }

    public void clearCart(Long userId) {
        Cart cart = getCartByUserId(userId);
        cart.getBooks().clear();
        cartRepository.save(cart);
    }
}