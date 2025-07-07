package org.example.lld.creational_patterns.factory_pattern.factories;

import org.example.lld.creational_patterns.factory_pattern.products.Button;
import org.example.lld.creational_patterns.factory_pattern.products.WindowsButton;

public class WindowsDialogFactory extends DialogFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
