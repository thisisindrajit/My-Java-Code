package org.java_playground.lld.problems.vending_machine.states;

import org.java_playground.lld.problems.vending_machine.entities.Item;
import org.java_playground.lld.problems.vending_machine.enums.PaymentTypeEnum;
import org.java_playground.lld.problems.vending_machine.exceptions.InvalidPaymentMethodException;
import org.java_playground.lld.problems.vending_machine.strategies.CardPaymentStrategy;
import org.java_playground.lld.problems.vending_machine.strategies.CashPaymentStrategy;

public class ItemSelectedState extends State {
    @Override
    public void selectItem(Item item) {
        System.out.println("Item already selected - " + vendingMachine.getSelectedItem().getName());
    }

    @Override
    public void payForItem(PaymentTypeEnum paymentType) {
        try {
            switch (paymentType) {
                case PaymentTypeEnum.CASH:
                    System.out.println("Selected payment mode - CASH");
                    vendingMachine.setPaymentStrategy(new CashPaymentStrategy());
                    break;
                case PaymentTypeEnum.CARD:
                    System.out.println("Selected payment mode - CARD");
                    vendingMachine.setPaymentStrategy(new CardPaymentStrategy());
                    break;
                default:
                    throw new InvalidPaymentMethodException("Invalid payment method!");
            }

            vendingMachine.setState(new PaymentProcessingState());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void checkPaymentStatus() {
        System.out.println("Cannot check payment status before payment is done!");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please pay before the item can be dispensed!");
    }
}
