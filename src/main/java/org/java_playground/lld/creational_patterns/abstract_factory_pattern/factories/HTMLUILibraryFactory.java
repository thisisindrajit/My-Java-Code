package org.java_playground.lld.creational_patterns.abstract_factory_pattern.factories;

import org.java_playground.lld.creational_patterns.abstract_factory_pattern.products.Button;
import org.java_playground.lld.creational_patterns.abstract_factory_pattern.products.Checkbox;
import org.java_playground.lld.creational_patterns.abstract_factory_pattern.products.HTMLButton;
import org.java_playground.lld.creational_patterns.abstract_factory_pattern.products.HTMLCheckbox;

public class HTMLUILibraryFactory implements UILibraryFactory {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new HTMLCheckbox();
    }

    @Override
    public String render() {
        Button button = createButton();
        Checkbox checkbox = createCheckbox();

        return "Rendering HTML button and checkbox";
    }
}
