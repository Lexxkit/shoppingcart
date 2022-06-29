package com.lexxkit.shoppingcart.service;

import java.util.List;

public interface ShoppingCartService {

    List<Integer> getCart();

    String addToCart(List<Integer> itemsId);
}
