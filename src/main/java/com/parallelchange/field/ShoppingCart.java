package com.parallelchange.field;

public class ShoppingCart {
    private int price;
    private int numberOfProducts;
    private boolean hasDiscount;

    public void add(int price) {
        if (price >= 100) {
            hasDiscount = true;
        }
        this.price += price;
        this.numberOfProducts++;
    }

    public int calculateTotalPrice() {
        return price;
    }

    public boolean hasDiscount() {
        return hasDiscount;
    }

    public int numberOfProducts() {
        return numberOfProducts;
    }
}
