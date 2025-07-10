package org.example.lld.behavioural_patterns.observer_pattern.classes;

import org.example.lld.behavioural_patterns.observer_pattern.interfaces.Observer;
import org.example.lld.behavioural_patterns.observer_pattern.interfaces.Subject;

public class HumidityDisplay implements Observer {
    private Subject subject;

    public HumidityDisplay(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this); // Registering itself as an observer
    }

    @Override
    public void update(int temperature, int humidity) {
        // Displaying the temperature and humidity
        System.out.println("Current Humidity: " + humidity + "%");
    }
}
