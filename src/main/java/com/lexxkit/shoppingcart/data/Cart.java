package com.lexxkit.shoppingcart.data;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Cart {
    private String shoppingCart;

    public Cart() {
        this.shoppingCart = "Shopping cart";
    }

    public Cart(String shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public String getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(String shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
