package headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Coffie;

import headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Abstrac.Beverage;

public class Espresso extends Beverage {
    @Override
    public double cost() {
        return 2000;
    }

    public Espresso() {
        descript = "에스프레소";
    }
}
