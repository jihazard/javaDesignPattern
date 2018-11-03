package headFirstDesignPattern.ObserberPattern.WeatherStationMachine_Code;


import headFirstDesignPattern.ObserberPattern.WeatherStationMachine_Code.interfa.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temp;
    private float humidity;
    private String castMessageTemp;
    private String castMessageHumidity;




    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("포어케스트:" + temp +castMessageTemp+"//" + "F degrees and "  +  humidity +"//" + castMessageHumidity) ;
    }



    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherDataExtendObserver) {
            WeatherDataExtendObserver weatherData = (WeatherDataExtendObserver) obs;


            this.temp = weatherData.getTemp();
            if(temp > 20) {
                castMessageTemp = "20도 이상입니다 더워요";
            } else castMessageTemp = "20도 이하입니다 추워요";


            this.humidity=weatherData.getHumidity();
            if(humidity > 50) {
                castMessageHumidity = "비올 확률이 높아요";
            } else castMessageHumidity = "비올 확률이 낮아요";

            display();
        }
    }
}
