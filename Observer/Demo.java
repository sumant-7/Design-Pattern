package Observer;


public class Demo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer tvDisplay = new TvDisplay();
        Observer phoneDisplay = new PhoneDisplay();

        weatherStation.registerObserver(tvDisplay);
        weatherStation.registerObserver(phoneDisplay);

        weatherStation.setWeather("sunny");
    }
}
