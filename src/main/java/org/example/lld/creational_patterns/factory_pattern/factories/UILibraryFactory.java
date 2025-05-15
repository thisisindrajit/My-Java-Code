package org.example.lld.creational_patterns.factory_pattern.factories;

import org.example.lld.creational_patterns.factory_pattern.products.UIButton;

public abstract class UILibraryFactory {
    // This function is abstract because we want to create different types of buttons based on different factories.
    public abstract UIButton createButton();

    public void render() {
        UIButton button = createButton();
        button.paint();
        button.click();
    }
}
