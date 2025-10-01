package org.java_playground.lld.creational_patterns.factory_pattern.factories;

import org.java_playground.lld.creational_patterns.factory_pattern.products.Button;

public abstract class ButtonFactory {
    public abstract Button createButton();

    public String renderLabel() {
        Button button = createButton();
        return button.getLabel();
    }
}
