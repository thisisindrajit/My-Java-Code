package org.java_playground.lld.creational_patterns.factory_pattern.factories;

import org.java_playground.lld.creational_patterns.factory_pattern.products.Button;
import org.java_playground.lld.creational_patterns.factory_pattern.products.HTMLButton;

public class HTMLButtonFactory extends ButtonFactory {

    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
