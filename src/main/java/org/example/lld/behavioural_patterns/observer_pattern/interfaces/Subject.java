package org.example.lld.behavioural_patterns.observer_pattern.interfaces;

public interface Subject {
    // Method to register an observer
    void registerObserver(Observer observer);

    // Method to remove an observer
    void removeObserver(Observer observer);

    // Method to notify all observers of a change
    void notifyObservers();
}
