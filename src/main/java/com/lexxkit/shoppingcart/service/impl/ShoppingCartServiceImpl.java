package com.lexxkit.shoppingcart.service.impl;

import com.lexxkit.shoppingcart.data.Cart;
import com.lexxkit.shoppingcart.service.ShoppingCartService;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public String addToCart(List<Integer> itemsId) {
        cart.setShoppingCart(itemsId + "was added.");
        return cart.getShoppingCart();
    }
}
