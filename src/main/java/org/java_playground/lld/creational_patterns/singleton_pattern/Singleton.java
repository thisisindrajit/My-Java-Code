package org.java_playground.lld.creational_patterns.singleton_pattern;

public class Singleton {
//    //  Thread safe way - DCL (Double-Checked Locking) - Using synchronized and volatile
///**
//     * Why is it recommended to use `volatile` and not `final` while declaring the singletonObj?
//     *
//     * - The `volatile` keyword is used instead of `final` because the `singletonObj` field needs to be mutable and thread-safe.
//     *
//     * Reasons:
//     * 1. Mutable requirement: The field starts as `null` and gets assigned a value later in `getSingletonObj()`.
//     *    If it were `final`, it would need to be initialized at declaration or in the constructor, which defeats the lazy initialization purpose of the singleton pattern.
//     *
//     * 2. Thread safety: `volatile` ensures that when one thread assigns a value to `singletonObj`, that change is immediately visible to all other threads.
//     *    Without `volatile`, threads might see a cached/stale value due to CPU caching.
//     *
//     * 3. Double-Checked Locking pattern: The `volatile` keyword prevents instruction reordering that could cause issues in multi-threaded environments.
//     *    Without it, a thread might see a partially constructed object.
//     *
//     * Why not `final`?
//     * - `final` would require initialization at declaration: `private static final Singleton singletonObj = new Singleton();`
//     * - This would create the instance immediately (eager initialization) rather than lazily.
//     * - It defeats the purpose of lazy initialization in the singleton pattern.
//     *
//     * The `volatile` keyword ensures thread-safe lazy initialization, while `final` would force eager initialization.
//     */
//    private static volatile Singleton singletonObj;
//
//    // Making constructor private so that no objects of this class can be created
//    private Singleton() {
//
//    }
//
//    public static Singleton getSingletonObj() {
//        // First if condition check (Non-synchronized so multiple threads can check at same time)
//        if (singletonObj == null) {
//            synchronized (Singleton.class) {
//                // Second if condition check (Synchronized)
//                if (singletonObj == null) {
//                    System.out.println("New Singleton object being created...");
//                    singletonObj = new Singleton();
//                } else {
//                    System.out.println("Singleton object already exists and returning the object...");
//                }
//            }
//        } else {
//            System.out.println("Singleton object already exists and returning the object...");
//        }
//
//        return singletonObj;
//    }
//
//    public void printMessage() {
//        System.out.println("Printing sample message");
//    }

    //  EVEN BETTER WAY TO DO IT (USE JVM CAPABILITY DIRECTLY)
    /** In this method, we rely on the JVM to create the singleton instance when the class is loaded. The JVM
     * guarantees that the instance will be created before any thread access the instance variable. This
     * implementation is one of the simplest and inherently thread-safe without needing explicit synchronization.
     */

    private static final Singleton singletonObj = new Singleton();

    private Singleton() {

    }

    public static Singleton getSingletonObj() {
        return singletonObj;
    }

    public void printMessage() {
        System.out.println("Printing sample message");
    }
}
