package headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Coffie;

import headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Abstrac.Beverage;

public class DarkRoast extends Beverage {

    public double cost() {
        return 4000;
    }

    public DarkRoast() {
        descript="다크롬스트";
    }
}
