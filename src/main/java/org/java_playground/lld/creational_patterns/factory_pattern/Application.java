package org.java_playground.lld.creational_patterns.factory_pattern;

import org.java_playground.lld.creational_patterns.factory_pattern.factories.DialogFactory;
import org.java_playground.lld.creational_patterns.factory_pattern.factories.HTMLDialogFactory;
import org.java_playground.lld.creational_patterns.factory_pattern.factories.WindowsDialogFactory;

public class Application {
    public static void main(String[] args) {
        // Create a factory for HTML buttons
        DialogFactory htmlDialogFactory = new HTMLDialogFactory();
        // Render the label of the button created by the factory
        String htmlLabel = htmlDialogFactory.renderLabel();
        // Print the label to the console
        System.out.println("Button label: " + htmlLabel);

        // Create a factory for Windows buttons
        DialogFactory windowsDialogFactory = new WindowsDialogFactory();
        // Render the label of the button created by the factory
        String windowsLabel = windowsDialogFactory.renderLabel();
        // Print the label to the console
        System.out.println("Button label: " + windowsLabel);
    }
}