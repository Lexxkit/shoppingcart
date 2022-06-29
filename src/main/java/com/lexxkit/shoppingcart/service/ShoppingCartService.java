package com.lexxkit.shoppingcart.service;

import java.util.List;

public interface ShoppingCartService {

    String getCart();

    String addToCart(List<Integer> itemsId);
}
