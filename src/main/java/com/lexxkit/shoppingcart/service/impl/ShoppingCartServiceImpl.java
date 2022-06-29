package com.lexxkit.shoppingcart.service.impl;

import com.lexxkit.shoppingcart.data.Cart;
import com.lexxkit.shoppingcart.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private final Cart cart;

    public ShoppingCartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String getCart() {
        return cart.getShoppingCart();
    }

    @Override
    public String addToCart(Integer id) {
        cart.setShoppingCart(id + "was added.");
        return cart.getShoppingCart();
    }
}
