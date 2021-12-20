package com.parallelchange.field;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    private int price;
    private int numberOfProducts;
    private boolean hasDiscount;

    private final List<Integer> prices = new LinkedList<>();

    public void add(int price) {
        if (price >= 100) {
            hasDiscount = true;
        }
        this.price += price;
        this.numberOfProducts++;
        this.prices.add(price);
    }

    public int calculateTotalPrice() {
        return prices.stream().mapToInt(Integer::valueOf).sum();
    }

    public boolean hasDiscount() {
        return prices.stream().anyMatch(integer -> integer >= 100);
    }

    public int numberOfProducts() {
        return numberOfProducts;
    }
}
