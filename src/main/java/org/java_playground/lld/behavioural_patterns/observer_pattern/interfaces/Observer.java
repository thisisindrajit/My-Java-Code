package org.java_playground.lld.behavioural_patterns.observer_pattern.interfaces;

public interface Observer {
    // Method to update the state of the object when Subject notifies it
    void update(int temperature, int humidity);
}
