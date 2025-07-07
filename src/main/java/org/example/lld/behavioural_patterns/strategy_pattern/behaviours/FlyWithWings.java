package org.example.lld.behavioural_patterns.strategy_pattern.behaviours;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying with wings!");
    }
}
