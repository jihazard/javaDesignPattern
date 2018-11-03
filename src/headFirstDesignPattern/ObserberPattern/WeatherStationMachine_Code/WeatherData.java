package headFirstDesignPattern.ObserberPattern.WeatherStationMachine_Code;

import headFirstDesignPattern.ObserberPattern.WeatherStationMachine_Code.interfa.Observer;
import headFirstDesignPattern.ObserberPattern.WeatherStationMachine_Code.interfa.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {

   private ArrayList observers;
   private float temp;
   private float humidity;
   private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void resisterObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserber(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temp,humidity,pressure);

        }
    }

    public void mesurementChanged(){
        notifyObserver();
    }

    public void setMesurements(float temp, float humidity , float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }


}
