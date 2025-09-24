package org.java_playground.lld.problems.vending_machine;

public class VendingMachine {
    private static volatile VendingMachine INSTANCE;

    // Private constructor to not allow creation of objects
    private VendingMachine() {

    }

    public static VendingMachine getInstance() {
        VendingMachine result = INSTANCE;

        // DOUBLE-CHECKED LOCKING
        // This code is to make sure that multiple threads do not create multiple instances of VendingMachine
        if (result == null) {
            synchronized (VendingMachine.class) {
                if(INSTANCE == null) {
                    INSTANCE = new VendingMachine();
                }

                return INSTANCE;
            }
        }

        return result;
    }


}
