package org.java_playground.lld.creational_patterns.factory_pattern.products;

public class HTMLButton implements Button {
    @Override
    public String getLabel() {
        return "HTML Button";
    }
}