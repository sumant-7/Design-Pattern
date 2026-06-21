package Observer;

public class TvDisplay implements Observer{
    String weather;
    @Override
    public void notifyObserver(String weather) {
        this.weather = weather;
        System.out.println("TV Display notified ");
        show();
    }
    public void show(){
        System.out.println("Tv Display showing : "+ weather );
    }
}
