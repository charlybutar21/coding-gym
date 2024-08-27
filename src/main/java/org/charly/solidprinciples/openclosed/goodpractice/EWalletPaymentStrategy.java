package org.charly.solidprinciples.openclosed.goodpractice;

public class EWalletPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        // Logic for processing e-wallet payment
        System.out.println("Processing e-wallet payment of amount: " + amount);
    }
}
