package org.example.lld.creational_patterns.factory_pattern.factories;

import org.example.lld.creational_patterns.factory_pattern.products.HTMLButton;
import org.example.lld.creational_patterns.factory_pattern.products.Button;

public class HTMLDialogFactory extends DialogFactory {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
