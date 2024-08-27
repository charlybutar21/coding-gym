package org.charly.solidprinciples.openclosed.badpractice;

public class PaymentProcessor {
    public void processPayment(String paymentMethod, double amount) {
        if (paymentMethod.equals("creditCard")) {
            processCreditCardPayment(amount);
        } else if (paymentMethod.equals("bankTransfer")) {
            processBankTransferPayment(amount);
        } else if (paymentMethod.equals("eWallet")) {
            processEWalletPayment(amount);
        } else {
            throw new IllegalArgumentException("Unsupported payment method: " + paymentMethod);
        }
    }

    private void processCreditCardPayment(double amount) {
        // Logic for processing credit card payment
        System.out.println("Processing credit card payment of amount: " + amount);
    }

    private void processBankTransferPayment(double amount) {
        // Logic for processing bank transfer payment
        System.out.println("Processing bank transfer payment of amount: " + amount);
    }

    private void processEWalletPayment(double amount) {
        // Logic for processing e-wallet payment
        System.out.println("Processing e-wallet payment of amount: " + amount);
    }
}
