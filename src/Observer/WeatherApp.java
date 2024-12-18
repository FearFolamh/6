package Observer;

class WeatherApp implements Observer {
    private String appName;

    public WeatherApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(float temperature) {
        System.out.println(appName + " received update: Temperature is now " + temperature + "°C");
    }
}
