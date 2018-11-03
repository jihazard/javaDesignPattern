package headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Condiment;

import headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Abstrac.Beverage;
import headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Abstrac.CondimetDecorator;

public class Mocha extends CondimetDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        System.out.println("===모카추가====");
        return beverage.getDescription() + ",  모카추가";
    }

    @Override
    public double cost() {
        return 300 + beverage.cost();
    }
}
