package com.lexxkit.shoppingcart.controller;

import com.lexxkit.shoppingcart.service.ShoppingCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/order")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping(path = "/get")
    public String getCart() {
        return shoppingCartService.getCart();
    }

    @GetMapping(path = "/add")
    public String addToCart() {
        return shoppingCartService.addToCart(1);
    }
}
