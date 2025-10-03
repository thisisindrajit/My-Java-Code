package org.java_playground.lld.problems.vending_machine.states;

import org.java_playground.lld.problems.vending_machine.entities.Item;
import org.java_playground.lld.problems.vending_machine.enums.PaymentTypeEnum;

public class IdleState extends State {
    @Override
    public void selectItem(Item item) {
        System.out.println("Selected item - " + item.getName());

        vendingMachine.setSelectedItem(item);

        if(inventory.getCountOfItem(item) == 0) {
            vendingMachine.setState(new OutOfStockState());
        } else {
            vendingMachine.setState(new ItemSelectedState());
        }
    }

    @Override
    public void payForItem(PaymentTypeEnum paymentType) {
        System.out.println("No items selected!");
    }

    @Override
    public void checkPaymentStatus() {
        System.out.println("No items selected!");
    }

    @Override
    public void dispenseItem() {
        System.out.println("No items selected!");
    }
}
