package com.lexxkit.shoppingcart.data;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Component
@SessionScope
public class Cart {
    private List<Integer> shoppingCart;

    public Cart(List<Integer> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public List<Integer> getShoppingCart() {
        return shoppingCart;
    }

    public void addToCart(int item) {
        shoppingCart.add(item);
    }

}
