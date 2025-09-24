package org.java_playground.lld.behavioural_patterns.strategy_pattern.classes;

import org.java_playground.lld.behavioural_patterns.strategy_pattern.behaviours.FlyBehaviour;
import org.java_playground.lld.behavioural_patterns.strategy_pattern.behaviours.QuackBehaviour;

public abstract class Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    // Abstract classes can have constructors, but they can't be used to initialize objects of abstract class
    public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    // Abstract method to be implemented by subclasses. Each Duck subclass will define its own display method.
    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
