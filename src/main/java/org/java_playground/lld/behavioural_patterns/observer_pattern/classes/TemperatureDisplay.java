package org.java_playground.lld.behavioural_patterns.observer_pattern.classes;

import org.java_playground.lld.behavioural_patterns.observer_pattern.interfaces.Observer;
import org.java_playground.lld.behavioural_patterns.observer_pattern.interfaces.Subject;

public class TemperatureDisplay implements Observer {
    private Subject subject;

    public TemperatureDisplay(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this); // Registering itself as an observer
    }

    @Override
    public void update(int temperature, int humidity) {
        // Displaying the temperature and humidity
        System.out.println("Current Temperature: " + temperature + "°C");
    }
}
