package org.java_playground.lld.problems.vending_machine.states;

import org.java_playground.lld.problems.vending_machine.entities.Item;
import org.java_playground.lld.problems.vending_machine.enums.PaymentTypeEnum;

public class PaymentProcessingState extends State {
    @Override
    public void selectItem(Item item) {
        System.out.println("Item already selected - " + vendingMachine.getSelectedItem().getName());
    }

    @Override
    public void payForItem(PaymentTypeEnum paymentType) {
        System.out.println("Payment initiated, checking status...");
    }

    @Override
    public void checkPaymentStatus() {
        if(vendingMachine.getPaymentStrategy().getPaymentStatus()) {
            System.out.println("Payment done!");
            vendingMachine.setState(new DispensingState());
        }
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please wait, payment processing...");
    }
}
