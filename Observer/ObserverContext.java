package Observer;

public interface ObserverContext {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
