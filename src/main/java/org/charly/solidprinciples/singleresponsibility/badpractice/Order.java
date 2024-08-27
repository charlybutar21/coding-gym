package org.charly.solidprinciples.singleresponsibility.badpractice;

import java.util.ArrayList;
import java.util.List;

// Violation of SRP
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

    // This method processes the order and sends an email notification
    public void processOrder() {
        System.out.println("Order processed with total price: $" + totalPrice);

        // Email sending logic (responsibility #2)
        sendEmailNotification();
    }

    // This method sends an email notification to the customer
    private void sendEmailNotification() {
        System.out.println("Sending email notification to the customer...");
    }
}
