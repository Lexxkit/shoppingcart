package com.lexxkit.shoppingcart.service.impl;

import com.lexxkit.shoppingcart.data.Cart;
import com.lexxkit.shoppingcart.service.ShoppingCartService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private final Cart cart;

    public ShoppingCartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> getCart() {
        return Collections.unmodifiableList(cart.getShoppingCart());
    }

    @Override
    public String addToCart(List<Integer> itemsId) {
        itemsId.forEach(cart::addToCart);
        return itemsId + " was added to cart.";
    }
}
