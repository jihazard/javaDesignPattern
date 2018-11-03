package headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem;

import headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Abstrac.Beverage;
import headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Coffie.DarkRoast;
import headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Coffie.Espresso;
import headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Coffie.HouseBlend;
import headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Condiment.Milk;
import headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Condiment.Mocha;
import headFirstDesignPattern.DecoratorPattern_StarBusCoffieSystem.Condiment.Soy;

public class Simulator {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        beverage = new Soy(beverage);

        System.out.println(((Soy) beverage).getDescription() +"// " + beverage.cost());

        Beverage espresso = new Espresso();
        espresso = new Soy(espresso);
        espresso = new Milk(espresso);
        System.out.println((espresso.getDescription() +"//가격은 : " + espresso.cost()));

        Beverage darakRoast = new DarkRoast();
        darakRoast = new Mocha(darakRoast);
        darakRoast = new Milk(darakRoast);

        System.out.println(darakRoast.getDescription() +"// 가격은 : " + darakRoast.cost());
    }
}
