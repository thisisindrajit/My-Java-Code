package org.example.lld.creational_patterns.abstract_factory_pattern.products;

public class WindowsButton implements Button {
    public void paint() {
        System.out.println("Rendering a Windows button.");
    }

    public void click() {
        System.out.println("Windows button clicked.");
    }
}
