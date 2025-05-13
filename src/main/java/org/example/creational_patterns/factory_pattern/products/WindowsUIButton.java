package org.example.creational_patterns.factory_pattern.products;

public class WindowsUIButton implements UIButton {
    public void paint() {
        System.out.println("Windows button painted");
    }

    public void click() {
        System.out.println("Windows button clicked");
    }

}
