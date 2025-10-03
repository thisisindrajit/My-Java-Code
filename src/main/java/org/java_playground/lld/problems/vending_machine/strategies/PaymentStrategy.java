package org.java_playground.lld.problems.vending_machine.strategies;

public interface PaymentStrategy {
    void processPayment(double amount);
    boolean getPaymentStatus();
}
