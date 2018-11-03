package headFirstDesignPattern.ObserberPattern.WeatherStationMachine_Code;


import headFirstDesignPattern.ObserberPattern.WeatherStationMachine_Code.interfa.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temp;
    private float humidity;



    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("현재 컨디션 v2::" + temp +"//" + "F degrees and "  +  humidity) ;
    }



    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherDataExtendObserver) {
            WeatherDataExtendObserver weatherData = (WeatherDataExtendObserver) obs;
            this.temp = weatherData.getTemp();
            this.humidity=weatherData.getHumidity();
            display();
        }
    }
}
