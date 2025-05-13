package org.example.creational_patterns.factory_pattern.factories;

import org.example.creational_patterns.factory_pattern.products.HTMLUIButton;
import org.example.creational_patterns.factory_pattern.products.UIButton;

public class HTMLUILibraryFactory extends UILibraryFactory {
    @Override
    public UIButton createButton() {
        return new HTMLUIButton();
    }
}
