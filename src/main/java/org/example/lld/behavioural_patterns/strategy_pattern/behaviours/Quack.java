package org.example.lld.behavioural_patterns.strategy_pattern.behaviours;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
