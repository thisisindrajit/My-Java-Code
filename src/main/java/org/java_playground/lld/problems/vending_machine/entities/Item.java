package org.java_playground.lld.problems.vending_machine.entities;

import org.java_playground.lld.problems.vending_machine.enums.CategoryEnum;

public class Item {
    private final int sku;
    private String name;
    private double price;
    private int level;
    private CategoryEnum category;

    public Item(int sku, String name, double price, int level, CategoryEnum category) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.level = level;
        this.category = category;
    }

    public int getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }
}
