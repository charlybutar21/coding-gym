package org.charly.solidprinciples.singleresponsibility.goodpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void testAddItemAndTotalPrice() {
        Order order = new Order();
        order.addItem("Laptop", 1500.00);
        order.addItem("Mouse", 25.00);

        assertEquals(1525.00, order.getTotalPrice());
    }
}