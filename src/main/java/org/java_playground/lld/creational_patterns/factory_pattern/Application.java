package org.java_playground.lld.creational_patterns.factory_pattern;

import org.java_playground.lld.creational_patterns.factory_pattern.factories.ButtonFactory;
import org.java_playground.lld.creational_patterns.factory_pattern.factories.HTMLButtonFactory;
import org.java_playground.lld.creational_patterns.factory_pattern.factories.WindowsButtonFactory;

public class Application {
    public static void main(String[] args) {
        // Create a factory for HTML buttons
        ButtonFactory htmlDialogFactory = new HTMLButtonFactory();
        // Render the label of the button created by the factory
        String htmlLabel = htmlDialogFactory.renderLabel();
        // Print the label to the console
        System.out.println("Button label: " + htmlLabel);

        // Create a factory for Windows buttons
        ButtonFactory windowsDialogFactory = new WindowsButtonFactory();
        // Render the label of the button created by the factory
        String windowsLabel = windowsDialogFactory.renderLabel();
        // Print the label to the console
        System.out.println("Button label: " + windowsLabel);
    }
}