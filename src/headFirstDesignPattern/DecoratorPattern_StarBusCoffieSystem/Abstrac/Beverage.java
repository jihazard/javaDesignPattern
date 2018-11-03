package headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Abstrac;

public abstract  class Beverage {
    public String descript = "노설명 " ;

    public String getDescription(){
        return  descript;
    }

    public abstract double cost();
}
