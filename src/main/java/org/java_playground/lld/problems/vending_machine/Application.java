package org.java_playground.lld.problems.vending_machine;

import org.java_playground.lld.problems.vending_machine.entities.Inventory;
import org.java_playground.lld.problems.vending_machine.entities.Item;
import org.java_playground.lld.problems.vending_machine.entities.VendingMachine;
import org.java_playground.lld.problems.vending_machine.enums.CategoryEnum;
import org.java_playground.lld.problems.vending_machine.enums.PaymentTypeEnum;
import org.java_playground.lld.problems.vending_machine.states.IdleState;

public class Application {
    public static void main(String[] args) {
        VendingMachine vendingMachine = VendingMachine.getInstance();
        Inventory inventory = Inventory.getInstance();

        // Create items and add them to inventory
        Item chips = new Item(1, "Lays", 20.0, 1, CategoryEnum.FOOD);
        Item chocolate = new Item(2, "KitKat", 25.0, 1, CategoryEnum.FOOD);
        Item water = new Item(3, "Bisleri", 15.0, 2, CategoryEnum.BEVERAGE);
        Item soda = new Item(4, "Coca-Cola", 30.0, 2, CategoryEnum.BEVERAGE);

        // Add items to inventory
        inventory.addItem(chips, 1);
        inventory.addItem(chocolate, 5);
        inventory.addItem(water, 3);
        inventory.addItem(soda, 4);

        // Setting initial state to idle state
        vendingMachine.setState(new IdleState());

        // Simulate getting item, paying for it and dispensing (Dispensing state, payment mode - cash)
        vendingMachine.getState().selectItem(chips);
        vendingMachine.getState().payForItem(PaymentTypeEnum.CASH);
        vendingMachine.getState().checkPaymentStatus();
        vendingMachine.getState().dispenseItem();

        System.out.println("-------------");
        // Simulate getting item, paying for it and dispensing (Out of stock state)
        vendingMachine.getState().selectItem(chips);
        vendingMachine.getState().payForItem(PaymentTypeEnum.CASH);
        vendingMachine.getState().checkPaymentStatus();
        vendingMachine.getState().dispenseItem();

        System.out.println("-------------");
        // Simulate getting item, paying for it and dispensing (Dispensing state, payment mode - card)
        vendingMachine.getState().selectItem(water);
        vendingMachine.getState().selectItem(water);
        vendingMachine.getState().payForItem(PaymentTypeEnum.CARD);
        vendingMachine.getState().checkPaymentStatus();
        vendingMachine.getState().dispenseItem();
    }
}
