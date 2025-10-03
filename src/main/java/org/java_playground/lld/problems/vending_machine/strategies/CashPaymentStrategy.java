package org.java_playground.lld.problems.vending_machine.strategies;

public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Amount paid using CASH");
    }

    @Override
    public boolean getPaymentStatus() {
        return true;
    }
}
