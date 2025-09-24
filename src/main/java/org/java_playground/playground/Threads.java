package org.java_playground.playground;

class C1 extends Thread {
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("hi");
            // Thread.sleep is used for the current thread to sleep for a specified number of milliseconds, so that hi and hello are printed in order
            try {
                Thread.sleep(10);
            } catch(InterruptedException ie) {

            }
        }
    }
}

class C2 extends Thread {
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("hello");
            // Thread.sleep is used for the current thread to sleep for a specified number of milliseconds, so that hi and hello are printed in order
            try {
                Thread.sleep(10);
            } catch(InterruptedException ie) {

            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        C1 obj1 = new C1();
        C2 obj2 = new C2();

        // Setting high priority for obj2
        obj2.setPriority(Thread.MAX_PRIORITY);

        // Start the threads
        obj1.start();
        // Thread.sleep is used to sleep for a specified number of milliseconds, so that hi and hello are printed in order
        try {
            Thread.sleep(10);
        } catch(InterruptedException ie) {

        }
        obj2.start();
    }
}
