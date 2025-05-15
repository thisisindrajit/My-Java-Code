package org.example.lld.creational_patterns.factory_pattern;

import java.util.*;
import org.example.lld.creational_patterns.factory_pattern.factories.HTMLUILibraryFactory;
import org.example.lld.creational_patterns.factory_pattern.factories.WindowsUILibraryFactory;
import org.example.lld.creational_patterns.factory_pattern.factories.UILibraryFactory;

public class Application {
    private static UILibraryFactory factory;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which UI library do you want to use?");
        System.out.println("1. HTML");
        System.out.println("2. Windows");

        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                factory = new HTMLUILibraryFactory();
                break;
            case 2:
                factory = new WindowsUILibraryFactory();
                break;
            default:
                System.out.println("Invalid choice");
        }

        if(factory == null) {
            System.out.println("No factory created");
            return;
        }

        factory.render();
    }
}
