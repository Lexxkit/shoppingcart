package com.lexxkit.shoppingcart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/store/order")
public class ShoppingCartController {

    @GetMapping(path = "/get")
    public String getCart() {
        return "List of items in cart.";
    }

    @GetMapping(path = "/add")
    public String addToCart() {
        return "Item was added.";
    }
}
