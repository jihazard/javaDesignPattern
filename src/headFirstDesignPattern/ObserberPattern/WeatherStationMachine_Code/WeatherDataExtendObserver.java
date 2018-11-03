package headFirstDesignPattern.ObserberPattern.WeatherStationMachine_Code;

import headFirstDesignPattern.ObserberPattern.WeatherStationMachine_Code.interfa.Observer;
import headFirstDesignPattern.ObserberPattern.WeatherStationMachine_Code.interfa.Subject;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherDataExtendObserver extends Observable {
   private float temp;
   private float humidity;
   private float pressure;

    public WeatherDataExtendObserver() {
    }


    public void mesurementChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMesurements(float temp, float humidity , float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        mesurementChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
