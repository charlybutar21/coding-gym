package org.charly.solidprinciples.openclosed.goodpractice;

public class BankTransferPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        // Logic for processing bank transfer payment
        System.out.println("Processing bank transfer payment of amount: " + amount);
    }
}
