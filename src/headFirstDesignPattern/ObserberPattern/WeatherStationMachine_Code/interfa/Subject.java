package headFirstDesignPattern.ObserberPattern.WeatherStationMachine_Code.interfa;



public interface Subject {
    public void resisterObserver(Observer o);
    public void removeObserber(Observer o);
    public void notifyObserver();
}
