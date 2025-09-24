package org.java_playground.lld.behavioural_patterns.strategy_pattern.classes;

import org.java_playground.lld.behavioural_patterns.strategy_pattern.behaviours.FlyWithWings;
import org.java_playground.lld.behavioural_patterns.strategy_pattern.behaviours.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
