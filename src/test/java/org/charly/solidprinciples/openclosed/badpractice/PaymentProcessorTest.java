package org.charly.solidprinciples.openclosed.badpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentProcessorTest {
    @Test
    void testCreditCardPayment() {
        PaymentProcessor processor = new PaymentProcessor();
        assertDoesNotThrow(() -> processor.processPayment("creditCard", 100.0));
    }

    @Test
    void testBankTransferPayment() {
        PaymentProcessor processor = new PaymentProcessor();
        assertDoesNotThrow(() -> processor.processPayment("bankTransfer", 200.0));
    }

    @Test
    void testEWalletPayment() {
        PaymentProcessor processor = new PaymentProcessor();
        assertDoesNotThrow(() -> processor.processPayment("eWallet", 50.0));
    }

    @Test
    void testUnsupportedPaymentMethod() {
        PaymentProcessor processor = new PaymentProcessor();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            processor.processPayment("unsupportedMethod", 150.0);
        });

        assertEquals("Unsupported payment method: unsupportedMethod", exception.getMessage());
    }
}