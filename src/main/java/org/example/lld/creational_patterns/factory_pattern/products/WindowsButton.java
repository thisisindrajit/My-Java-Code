package org.example.lld.creational_patterns.factory_pattern.products;

public class WindowsButton implements Button {
    public void paint() {
        System.out.println("Windows button painted");
    }

    public void click() {
        System.out.println("Windows button clicked");
    }

}
