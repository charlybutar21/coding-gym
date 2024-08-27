package org.charly.solidprinciples.openclosed.goodpractice;

import org.junit.jupiter.api.Test;

class PaymentProcessorTest {
    @Test
    public void testCreditCardPayment() {
        PaymentProcessor processor = new PaymentProcessor(new CreditCardPaymentStrategy());
        processor.processPayment(100.0);
    }

    @Test
    public void testBankTransferPayment() {
        PaymentProcessor processor = new PaymentProcessor(new BankTransferPaymentStrategy());
        processor.processPayment(200.0);
    }

    @Test
    public void testEWalletPayment() {
        PaymentProcessor processor = new PaymentProcessor(new EWalletPaymentStrategy());
        processor.processPayment(50.0);
    }
}