package org.example.lld.creational_patterns.abstract_factory_pattern.factories;

import org.example.lld.creational_patterns.abstract_factory_pattern.products.Button;
import org.example.lld.creational_patterns.abstract_factory_pattern.products.Checkbox;
import org.example.lld.creational_patterns.abstract_factory_pattern.products.HTMLButton;
import org.example.lld.creational_patterns.abstract_factory_pattern.products.HTMLCheckbox;

public class HTMLUILibraryFactory implements UILibraryFactory {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new HTMLCheckbox();
    }
}
