package com.parallelchange.field;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ShoppingCartTest {


    @Test
    public void singleItem_numberOfProductsInTheCart() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);

        int actual = shoppingCart.numberOfProducts();

        assertThat(actual).isEqualTo(1);
    }

    @Test
    public void singleItem_totalPrice() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);

        int actual = shoppingCart.calculateTotalPrice();

        assertThat(actual).isEqualTo(10);
    }

    @Test
    public void singleItem_hasDiscountIfContainsAtLeastOneProductWorthAtLeast100() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(100);

        boolean hasDiscount = shoppingCart.hasDiscount();

        assertThat(hasDiscount).isTrue();
    }

    @Test
    public void singleItem_doesNotHaveDiscountIfContainsNoProductsWorthAtLeast100() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(99);

        boolean hasDiscount = shoppingCart.hasDiscount();

        assertThat(hasDiscount).isFalse();
    }

}
