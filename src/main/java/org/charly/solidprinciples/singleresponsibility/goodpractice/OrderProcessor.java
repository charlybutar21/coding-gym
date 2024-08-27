package org.charly.solidprinciples.singleresponsibility.goodpractice;

// OrderProcessor class responsible for processing orders
public class OrderProcessor {

    public void processOrder(Order order) {
        System.out.println("Order processed with total price: $" + order.getTotalPrice());
    }

}
