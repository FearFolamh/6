package Singleton;

public class Main {
    public static void main(String[] args) {
        GameSettings settings = GameSettings.getInstance();
        settings.setVolume(75);
        settings.setResolution("2560x1440");

        System.out.println(settings);
    }
}