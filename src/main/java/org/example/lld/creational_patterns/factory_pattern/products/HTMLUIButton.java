package org.example.lld.creational_patterns.factory_pattern.products;

public class HTMLUIButton implements UIButton {
    public void paint() {
        System.out.println("HTML button painted");
    }

    public void click() {
        System.out.println("HTML button clicked");
    }
}
