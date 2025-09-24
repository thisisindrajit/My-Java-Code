package org.java_playground.playground;

interface GenericInterface <T> {
    T getObject();
}

class Test<T> implements GenericInterface<T> {
    private T obj;

    Test(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return this.obj;
    }
}

public class Generics {
    // A Generic method example. <T> denotes that this method is generic.
    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    // Driver method
    public static void main(String[] args) {
        // Calling generic method with Integer argument
        genericDisplay(11);

        // Calling generic method with String argument
        genericDisplay("CodeWithAryan");

        // Calling generic method with double argument
        genericDisplay(1.0);

        Test<String> obj1 = new Test<>("Indrajit");
        Test<Integer> obj2 = new Test<>(23);

        System.out.println(obj1.getObject());
        System.out.println(obj2.getObject());
    }
}
