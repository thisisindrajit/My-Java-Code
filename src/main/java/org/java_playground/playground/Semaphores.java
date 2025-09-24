package org.java_playground.playground;

import java.util.concurrent.Semaphore;

// TODO: STUDY MORE ON SEMAPHORES
public class Semaphores {
    // The main class Semaphores
    private Semaphore s1 = new Semaphore(1);
    private Semaphore s2 = new Semaphore(0);

    // Inner classes A and B extend Thread class
    class A extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    s1.acquire(); // Acquire the semaphore s1 to print hi
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("hi");
                s2.release(); // Release the semaphore s2 because hi is printed and hello is waiting
            }
        }
    }

    class B extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    s2.acquire(); // Acquire the semaphore s2 to print hello
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("hello");
                s1.release(); // Release the semaphore s1 because hello is printed and hi is waiting
            }
        }
    }

    public static void main(String[] args) {
        Semaphores sm = new Semaphores();
        // Creating new objects of inner classes A and B
        A obj1 = sm.new A();
        B obj2 = sm.new B();

        obj1.start();
        obj2.start();
    }
}
