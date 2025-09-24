package org.java_playground.lld.creational_patterns.abstract_factory_pattern.products;

public class HTMLButton implements Button {
    @Override
    public void paint() {
        System.out.println("HTML button painted");
    }

    @Override
    public void click() {
        System.out.println("HTML button clicked");
    }
}
