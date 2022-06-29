package com.lexxkit.shoppingcart.controller;

import com.lexxkit.shoppingcart.service.ShoppingCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping(path = "/get")
    public String getCart() {
        return shoppingCartService.getCart().toString();
    }

    @GetMapping(path = "/add")
    public String addToCart(@RequestParam("item") List<Integer> items) {
        return shoppingCartService.addToCart(items);
    }
}
