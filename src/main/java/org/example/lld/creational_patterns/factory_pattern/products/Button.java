package org.example.lld.creational_patterns.factory_pattern.products;

public interface Button {
    // Not using public and abstract keywords as it is the default access modifier in interfaces and all methods are abstract
    void paint();
    void click();
}
