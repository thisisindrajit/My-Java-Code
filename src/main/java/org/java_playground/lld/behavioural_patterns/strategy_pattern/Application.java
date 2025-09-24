package org.java_playground.lld.behavioural_patterns.strategy_pattern;

import org.java_playground.lld.behavioural_patterns.strategy_pattern.behaviours.FlyNoWay;
import org.java_playground.lld.behavioural_patterns.strategy_pattern.behaviours.Squeak;
import org.java_playground.lld.behavioural_patterns.strategy_pattern.classes.Duck;
import org.java_playground.lld.behavioural_patterns.strategy_pattern.classes.MallardDuck;

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
