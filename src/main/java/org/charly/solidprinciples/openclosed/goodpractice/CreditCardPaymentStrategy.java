package org.charly.solidprinciples.openclosed.goodpractice;

public class CreditCardPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        // Logic for processing credit card payment
        System.out.println("Processing credit card payment of amount: " + amount);
    }
}
