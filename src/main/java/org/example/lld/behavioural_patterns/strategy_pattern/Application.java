package org.example.lld.behavioural_patterns.strategy_pattern;

import org.example.lld.behavioural_patterns.strategy_pattern.behaviours.FlyNoWay;
import org.example.lld.behavioural_patterns.strategy_pattern.behaviours.Squeak;

public class Application {
    public static void main(String[] args) {
        Duck d = new MallardDuck();

        d.display();
        d.performFly();
        d.performQuack();

        d.setFlyBehaviour(new FlyNoWay());
        d.setQuackBehaviour(new Squeak());

        d.performFly();
        d.performQuack();
    }
}
