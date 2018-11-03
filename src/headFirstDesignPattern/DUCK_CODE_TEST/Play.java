package headFirstDesignPattern.DUCK_CODE_TEST;

import headFirstDesignPattern.DUCK_CODE_TEST.interfac.FlyRocketPower;

public class Play {
    public static void main(String[] args) {
        Duck aduck = new MallarDuck();
        aduck.performFly();
        aduck.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaver(new FlyRocketPower());
        model.performFly();

        model.performQuack();
    }
}
