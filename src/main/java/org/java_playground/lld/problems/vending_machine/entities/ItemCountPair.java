package org.java_playground.lld.problems.vending_machine.entities;

public class ItemCountPair {
    private final Item item;
    private int count;

    public ItemCountPair(Item item, int count) {
        this.item = item;
        this.count = count;
    }

    public Item getItem() {
        return item;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}