package headFirstDesignPattern.ObserberPattern.WeatherStationMachine_Code;

import headFirstDesignPattern.ObserberPattern.WeatherStationMachine_Code.interfa.DisplayElement;
import headFirstDesignPattern.ObserberPattern.WeatherStationMachine_Code.interfa.Observer;
import headFirstDesignPattern.ObserberPattern.WeatherStationMachine_Code.interfa.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private Subject weatherData;

    public StatisticsDisplay( Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.resisterObserver(this);
    }

    @Override
    public void display() {
        System.out.println("최고 컨디션 ::" + temp +"//" + "F 평균 and "  +  humidity +"// humitiy!!!!") ;
    }

    @Override
    public void update(float temp, float humidity, float presure) {
        this.temp=temp;
        this.humidity =humidity;
        display();
    }
}
