package org.example.lld.creational_patterns.abstract_factory_pattern.factories;

import org.example.lld.creational_patterns.abstract_factory_pattern.products.Button;
import org.example.lld.creational_patterns.abstract_factory_pattern.products.Checkbox;

public interface UILibraryFactory {
    Button createButton();
    Checkbox createCheckbox();
}
