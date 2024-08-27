package org.charly.solidprinciples.singleresponsibility.goodpractice;


import java.util.ArrayList;
import java.util.List;

// Order class responsible only for managing items and total price
public class Order {
    private List<String> items;
    private double totalPrice;

    public Order() {
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addItem(String item, double price) {
        items.add(item);
        totalPrice += price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
