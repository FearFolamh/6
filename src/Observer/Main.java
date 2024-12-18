package Observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Observer app1 = new WeatherApp("WeatherApp1");
        Observer app2 = new WeatherApp("WeatherApp2");

        station.addObserver(app1);
        station.addObserver(app2);

        station.setTemperature(25.0f);
        station.setTemperature(30.0f);

        station.removeObserver(app1);

        station.setTemperature(20.0f);
    }
}
