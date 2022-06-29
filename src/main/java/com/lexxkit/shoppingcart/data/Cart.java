package com.lexxkit.shoppingcart.data;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
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
