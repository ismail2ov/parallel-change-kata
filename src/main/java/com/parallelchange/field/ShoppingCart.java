package com.parallelchange.field;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {

    private final List<Integer> prices = new LinkedList<>();

    public void add(int price) {
        this.prices.add(price);
    }

    public int calculateTotalPrice() {
        return prices.stream().mapToInt(Integer::valueOf).sum();
    }

    public boolean hasDiscount() {
        return prices.stream().anyMatch(integer -> integer >= 100);
    }

    public int numberOfProducts() {
        return prices.size();
    }
}
