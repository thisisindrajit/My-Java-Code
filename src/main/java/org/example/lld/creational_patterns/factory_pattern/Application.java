package org.example.lld.creational_patterns.factory_pattern;

import java.util.Scanner;
import org.example.lld.creational_patterns.factory_pattern.factories.HTMLDialogFactory;
import org.example.lld.creational_patterns.factory_pattern.factories.WindowsDialogFactory;
import org.example.lld.creational_patterns.factory_pattern.factories.DialogFactory;

public class Application {
    public static void main(String[] args) {
        DialogFactory factory = selectFactory();
        factory.render();
    }

    public static DialogFactory selectFactory() {
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
                        yield new HTMLDialogFactory();
                    }
                    case 2 -> {
                        sc.close();
                        yield new WindowsDialogFactory();
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