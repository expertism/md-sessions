package org.mdigital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingBasketTest {
    @Test
    void correctShoppingItems() {
        ShoppingBasket shop = new ShoppingBasket();


        String[] result = shop.getCart();

        assertArrayEquals(
                new String[]{"apples", "coke", "milk"},
                result
                );
    }

}