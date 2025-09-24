package org.java_playground.lld.creational_patterns.factory_pattern.factories;

import org.java_playground.lld.creational_patterns.factory_pattern.products.Button;

public abstract class DialogFactory {
    public abstract Button createProduct();

    public String renderLabel() {
        Button button = createProduct();
        return button.getLabel();
    }
}
