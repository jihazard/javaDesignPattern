package headFirstDesignPattern.DUCK_CODE_TEST;

import headFirstDesignPattern.DUCK_CODE_TEST.interfac.FlyNoWay;
import headFirstDesignPattern.DUCK_CODE_TEST.interfac.Quack;

public class MallarDuck extends Duck {
    public MallarDuck () {
        quackBeheaver = new Quack();
        flyBehaver = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("저는 오리여유");
    }
}
