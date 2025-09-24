package org.java_playground.lld.behavioural_patterns.observer_pattern.classes;

import org.java_playground.lld.behavioural_patterns.observer_pattern.interfaces.Observer;
import org.java_playground.lld.behavioural_patterns.observer_pattern.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private int temperature;
    private int humidity;
    private List<Observer> observers;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity); // Using the PULL method to get the latest data from the subject to the observer instead of the PUSH method that would send data directly.
        }
    }

    public void setMeasurements(int temperature, int humidity) {
        // Simulate new weather data
        this.temperature = temperature;
        this.humidity = humidity;
        System.out.println("New weather data received.");
        notifyObservers(); // Notify all observers about the new data
    }
}
