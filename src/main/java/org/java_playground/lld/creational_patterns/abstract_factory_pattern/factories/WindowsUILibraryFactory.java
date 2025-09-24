package org.java_playground.lld.creational_patterns.abstract_factory_pattern.factories;

import org.java_playground.lld.creational_patterns.abstract_factory_pattern.products.Checkbox;
import org.java_playground.lld.creational_patterns.abstract_factory_pattern.products.WindowsButton;
import org.java_playground.lld.creational_patterns.abstract_factory_pattern.products.WindowsCheckbox;
import org.java_playground.lld.creational_patterns.abstract_factory_pattern.products.Button;

public class WindowsUILibraryFactory implements UILibraryFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public String render() {
        Button button = createButton();
        Checkbox checkbox = createCheckbox();
        button.click();
        checkbox.onClick();

        return "Rendering Windows button and checkbox";
    }
}
