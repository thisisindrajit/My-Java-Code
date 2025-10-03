package org.java_playground.lld.problems.vending_machine.states;

import org.java_playground.lld.problems.vending_machine.entities.Item;
import org.java_playground.lld.problems.vending_machine.enums.PaymentTypeEnum;

public class OutOfStockState extends State {
    @Override
    public void selectItem(Item item) {
        System.out.println("Selected item is out of stock - " + vendingMachine.getSelectedItem().getName());
        vendingMachine.setState(new IdleState());
    }

    @Override
    public void payForItem(PaymentTypeEnum paymentType) {
        System.out.println("Selected item is out of stock - " + vendingMachine.getSelectedItem().getName());
        vendingMachine.reset();
    }

    @Override
    public void checkPaymentStatus() {
        System.out.println("Selected item is out of stock - " + vendingMachine.getSelectedItem().getName());
        vendingMachine.reset();
    }

    @Override
    public void dispenseItem() {
        System.out.println("Selected item is out of stock - " + vendingMachine.getSelectedItem().getName());
        vendingMachine.reset();
    }
}
