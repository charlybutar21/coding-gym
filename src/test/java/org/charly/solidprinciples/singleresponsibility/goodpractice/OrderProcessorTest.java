package org.charly.solidprinciples.singleresponsibility.goodpractice;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class OrderProcessorTest {

    @Test
    void testProcessOrder() {
        Order order = mock(Order.class);
        when(order.getTotalPrice()).thenReturn(1525.00);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder(order);

        verify(order).getTotalPrice();
    }
}