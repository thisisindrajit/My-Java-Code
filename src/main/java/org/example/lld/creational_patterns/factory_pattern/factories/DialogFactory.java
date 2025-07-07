package org.example.lld.creational_patterns.factory_pattern.factories;

import org.example.lld.creational_patterns.factory_pattern.products.Button;

public abstract class DialogFactory {
    // This method is abstract and must be implemented by subclasses to create specific button types.
    public abstract Button createButton();

    public void render() {
        Button button = createButton();
        button.paint();
        button.click();
    }
}
