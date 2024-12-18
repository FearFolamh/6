package Observer;
import java.util.ArrayList;
import java.util.List;

class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    // Добавление наблюдателя
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Удаление наблюдателя
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Уведомление всех наблюдателей
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    // Установка новой температуры и уведомление наблюдателей
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
