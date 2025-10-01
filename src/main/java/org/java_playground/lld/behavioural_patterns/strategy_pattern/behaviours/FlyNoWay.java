package org.java_playground.lld.behavioural_patterns.strategy_pattern.behaviours;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
