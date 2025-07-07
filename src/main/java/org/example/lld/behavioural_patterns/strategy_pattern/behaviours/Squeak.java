package org.example.lld.behavioural_patterns.strategy_pattern.behaviours;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
