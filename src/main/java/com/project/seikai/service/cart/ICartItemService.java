package com.project.seikai.service.cart;

import com.project.seikai.model.CartItem;

public interface ICartItemService {
    void addItemToCart(Long cartId, Long productId, int quantity);
    void removeItemFromCart(Long cartId, Long productId);

    CartItem getCartItem(Long cartId, Long productId);

    void updateItemQuantity(Long cartId, Long productId, int quantity);
}
