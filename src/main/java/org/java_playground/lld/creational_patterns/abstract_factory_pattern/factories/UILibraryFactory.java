package org.java_playground.lld.creational_patterns.abstract_factory_pattern.factories;

import org.java_playground.lld.creational_patterns.abstract_factory_pattern.products.Button;
import org.java_playground.lld.creational_patterns.abstract_factory_pattern.products.Checkbox;

public interface UILibraryFactory {
    Button createButton();
    Checkbox createCheckbox();
    String render();
}
