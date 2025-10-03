package org.java_playground.lld.problems.vending_machine.states;

import org.java_playground.lld.problems.vending_machine.entities.Inventory;
import org.java_playground.lld.problems.vending_machine.entities.Item;
import org.java_playground.lld.problems.vending_machine.entities.VendingMachine;
import org.java_playground.lld.problems.vending_machine.enums.PaymentTypeEnum;

public abstract class State {
    protected final VendingMachine vendingMachine = VendingMachine.getInstance();
    protected final Inventory inventory = Inventory.getInstance();

    public abstract void selectItem(Item item);
    public abstract void payForItem(PaymentTypeEnum paymentType);
    public abstract void checkPaymentStatus();
    public abstract void dispenseItem();
}
