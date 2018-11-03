package headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Coffie;

import headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Abstrac.Beverage;

public class HouseBlend extends Beverage {
    @Override
    public double cost() {
        return 3000;
    }

    public HouseBlend() {
        descript="하우스 블랜드";
    }
}
