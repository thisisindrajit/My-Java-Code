package org.example.lld.behavioural_patterns.strategy_pattern.behaviours;

public class FlyNoWay implements FlyBehaviour {
    public void fly() {
        System.out.println("I can't fly!");
    }
}
