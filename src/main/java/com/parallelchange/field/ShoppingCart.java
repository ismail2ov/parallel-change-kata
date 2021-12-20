package com.parallelchange.field;

public class ShoppingCart {
    private int price;
    private int numberOfProducts;

    public void add(int price) {
        this.price += price;
        this.numberOfProducts++;
    }

    public int calculateTotalPrice() {
        return price;
    }

    public boolean hasDiscount() {
        return price >= 100;
    }

    public int numberOfProducts() {
        return numberOfProducts;
    }
}
