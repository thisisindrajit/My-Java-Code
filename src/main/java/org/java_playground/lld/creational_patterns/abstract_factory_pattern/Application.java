package org.java_playground.lld.creational_patterns.abstract_factory_pattern;

import org.java_playground.lld.creational_patterns.abstract_factory_pattern.factories.HTMLUILibraryFactory;
import org.java_playground.lld.creational_patterns.abstract_factory_pattern.factories.UILibraryFactory;
import org.java_playground.lld.creational_patterns.abstract_factory_pattern.factories.WindowsUILibraryFactory;

import java.util.Scanner;

class Application {
    public static void main(String[] args) {
        UILibraryFactory factory = selectFactory();
        System.out.println(factory.render());
    }

    public static UILibraryFactory selectFactory() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Which UI library do you want to use?");
            System.out.println("1. HTML");
            System.out.println("2. Windows");
            System.out.print("Enter your choice: ");

            try {
                int choice = sc.nextInt();

                // This is enhanced switch
                return switch (choice) {
                    case 1 -> {
                        sc.close();
                        yield new HTMLUILibraryFactory();
                    }
                    case 2 -> {
                        sc.close();
                        yield new WindowsUILibraryFactory();
                    }
                    default -> throw new Exception();
                };
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 2.");
                sc.nextLine(); // Clear the invalid input
            }
        }
    }
}


