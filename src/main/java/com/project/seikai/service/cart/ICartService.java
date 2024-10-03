package com.project.seikai.service.cart;

import com.project.seikai.model.Cart;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);


    Long initializeNewCart();
}
