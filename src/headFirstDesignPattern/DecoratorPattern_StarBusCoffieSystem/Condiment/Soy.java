package headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Condiment;

import headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Abstrac.Beverage;
import headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Abstrac.CondimetDecorator;

public class Soy extends CondimetDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        System.out.println("===소이추가====");
        return beverage.getDescription() + ", 소이추가";
    }

    @Override
    public double cost() {
        return 500 + beverage.cost();
    }
}
