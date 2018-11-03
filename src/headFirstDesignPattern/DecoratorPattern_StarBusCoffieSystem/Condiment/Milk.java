package headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Condiment;

import headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Abstrac.Beverage;
import headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Abstrac.CondimetDecorator;

public class Milk extends CondimetDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        System.out.println("===우유추가====");
        return beverage.getDescription() + ", 우유";
    }

    @Override
    public double cost() {
        return 600 + beverage.cost();
    }
}
