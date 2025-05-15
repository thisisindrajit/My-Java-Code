package org.example.lld.creational_patterns.factory_pattern.factories;

import org.example.lld.creational_patterns.factory_pattern.products.UIButton;
import org.example.lld.creational_patterns.factory_pattern.products.WindowsUIButton;

public class WindowsUILibraryFactory extends UILibraryFactory {
    @Override
    public UIButton createButton() {
        return new WindowsUIButton();
    }
}
