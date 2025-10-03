package org.java_playground.lld.problems.vending_machine.entities;

import org.java_playground.lld.problems.vending_machine.states.IdleState;
import org.java_playground.lld.problems.vending_machine.states.State;
import org.java_playground.lld.problems.vending_machine.strategies.PaymentStrategy;

// This is the context object for state pattern
public class VendingMachine {
    private static final VendingMachine INSTANCE = new VendingMachine();
    private State state;
    private Item selectedItem;
    private PaymentStrategy paymentStrategy;

    private VendingMachine() {
        // this.state = new IdleState(); // DO NOT INITIALIZE STATE HERE AS IT CREATES A CIRCULAR DEPENDENCY!
        // REFERENCE - https://chatgpt.com/s/t_68dfec22ede88191968256383de5c237
    }

    public static VendingMachine getInstance() {
        return INSTANCE;
    }

    public void reset() {
        setSelectedItem(null);
        setState(new IdleState());
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Item getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(Item selectedItem) {
        this.selectedItem = selectedItem;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
