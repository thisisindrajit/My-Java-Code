package org.java_playground.lld.behavioural_patterns.strategy_pattern.behaviours;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
