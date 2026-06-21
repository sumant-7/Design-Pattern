package Observer;

import java.util.List;

public class WeatherStation implements ObserverContext{
    private List<Observer> observers = new java.util.ArrayList<>();
    private String weather;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.notifyObserver(weather);
        }
    }

    public void setWeather(String weather) {
        this.weather = weather;
        notifyObserver();
    }
}
