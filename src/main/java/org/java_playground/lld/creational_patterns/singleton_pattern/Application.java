package org.java_playground.lld.creational_patterns.singleton_pattern;

public class Application {
    public static void main(String[] args) {
        Runnable task = () -> {
            Singleton obj = Singleton.getSingletonObj();
            obj.printMessage();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}
