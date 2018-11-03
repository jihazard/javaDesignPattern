package headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Coffie;

import headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Abstrac.Beverage;

public class Decaf extends Beverage {
    @Override
    public double cost() {
        return 5000;
    }

    public Decaf() {
        descript= "디카페";
    }
}
