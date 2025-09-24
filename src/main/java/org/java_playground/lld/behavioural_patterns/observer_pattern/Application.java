package org.java_playground.lld.behavioural_patterns.observer_pattern;

import org.java_playground.lld.behavioural_patterns.observer_pattern.classes.HumidityDisplay;
import org.java_playground.lld.behavioural_patterns.observer_pattern.classes.TemperatureDisplay;
import org.java_playground.lld.behavioural_patterns.observer_pattern.classes.WeatherStation;
import org.java_playground.lld.behavioural_patterns.observer_pattern.interfaces.Observer;

public class Application {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Creating observers
        Observer temperatureDisplay = new TemperatureDisplay(weatherStation);
        Observer humidityDisplay = new HumidityDisplay(weatherStation);

        // Simulating weather updates
        weatherStation.setMeasurements(30, 65); // Setting temperature and humidity

        // Removing the temperature display observer
        weatherStation.removeObserver(temperatureDisplay);

        // Simulating another weather update
        weatherStation.setMeasurements(25, 70); // Setting new temperature and humidity
    }
}
