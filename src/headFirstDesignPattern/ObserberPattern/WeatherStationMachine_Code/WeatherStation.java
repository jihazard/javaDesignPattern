package headFirstDesignPattern.ObserberPattern.WeatherStationMachine_Code;

import java.util.Observable;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherDataExtendObserver data = new WeatherDataExtendObserver();



        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(data);
        ForecastDisplay forecastDisplay = new ForecastDisplay(data);
        data.setMesurements(39,29,40f);
    }
}
