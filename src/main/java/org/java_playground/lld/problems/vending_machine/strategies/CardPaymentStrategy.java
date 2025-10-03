package org.java_playground.lld.problems.vending_machine.strategies;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Amount paid using CARD");
    }

    @Override
    public boolean getPaymentStatus() {
        return true;
    }
}
