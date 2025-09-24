package org.java_playground.playground;

public class Interfaces_and_Enums {
    public static void main(String[] args) {
        // Enum (Enumeration) are named constants that can be used to define a set of related constants in a type-safe manner.
        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

        System.out.println(Day.MONDAY);
        System.out.println(Day.THURSDAY.ordinal());

        Day currentDay = Day.TUESDAY;

        switch(currentDay) {
            case MONDAY:
                System.out.println("It's Monday, start of the week!");
                break;
            case TUESDAY: // Here we need not explicitly state that we are using the enum type Day, as it is already defined in the switch statement
                System.out.println("It's Tuesday, keep going!");
                break;
            default:
                System.out.println("It's another day of the week!");
                break;
        }

        // Enum with constructor and methods
        enum Laptop {
            Macbook(1200), Dell(800), ThinkPad(1000);

            private int price;

            private Laptop(int price) {
                System.out.println("Inside enum Laptop constructor...");
                this.price = price;
            }

            public int getPrice() {
                return price;
            }
        }

        Laptop lap = Laptop.Macbook;
        System.out.println(lap.getPrice());

        // DIFFERENT TYPES OF INTERFACES
        // 1. Marker Interface: An interface with no methods or fields, used to mark a class as having a specific property.
        // 2. Functional Interface / SAM (Single Abstract Method) Interface: An interface with exactly one abstract method, which can be implemented using a lambda expression or method reference.
        // 3. Normal Interface: An interface that can have multiple abstract methods, default methods, and static methods.

        // Example of a Functional Interface
        @FunctionalInterface
        interface A {
            void show(int a);
        }

        // Example of anonymous inner class
        A obj = new A()
        {
            public void show(int a) {
                System.out.println("In A show");
            }
        };

        // Example of lambda expression
        A obj2 = a -> {
            System.out.println("In A show with lambda: " + a);
        };

        obj.show(5);
        obj2.show(6);

        interface Addition {
            int add(int i ,int j);
        }

        // Example of lambda expression with return type
        Addition obj3 = (i, j) -> i + j;

        System.out.println(obj3.add(5, 6));
    }
}
