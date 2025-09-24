package org.java_playground.lld.creational_patterns.factory_pattern.factories;

import org.java_playground.lld.creational_patterns.factory_pattern.products.Button;
import org.java_playground.lld.creational_patterns.factory_pattern.products.WindowsButton;

public class WindowsDialogFactory extends DialogFactory {

    @Override
    public Button createProduct() {
        return new WindowsButton();
    }
}
