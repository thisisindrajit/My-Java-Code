package org.java_playground.lld.problems.vending_machine.states;

import org.java_playground.lld.problems.vending_machine.entities.Item;
import org.java_playground.lld.problems.vending_machine.enums.PaymentTypeEnum;

public class DispensingState extends State {
    @Override
    public void selectItem(Item item) {
        System.out.println("Selected item - " + vendingMachine.getSelectedItem().getName());
    }

    @Override
    public void payForItem(PaymentTypeEnum paymentType) {
        System.out.println("Payment done for item - " + vendingMachine.getSelectedItem().getName());
    }

    @Override
    public void checkPaymentStatus() {
        System.out.println("Payment successful for item - " + vendingMachine.getSelectedItem().getName());
    }

    @Override
    public void dispenseItem() {
        System.out.println("Item dispensing and updating inventory - " + vendingMachine.getSelectedItem().getName());
        inventory.dispenseItem(vendingMachine.getSelectedItem());
        inventory.showInventory();
        vendingMachine.reset();
    }
}
