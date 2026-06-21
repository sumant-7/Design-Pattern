package Observer;

public class PhoneDisplay implements Observer{
    String weather;
    @Override
    public void notifyObserver(String weather) {
        this.weather = weather;
        System.out.println("Phone Display notified ");
        show();
    }
    public void show(){
        System.out.println("Phone Display showing : "+ weather );
    }

}
