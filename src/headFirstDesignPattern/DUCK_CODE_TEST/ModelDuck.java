package headFirstDesignPattern.DUCK_CODE_TEST;

import headFirstDesignPattern.DUCK_CODE_TEST.interfac.FlyNoWay;
import headFirstDesignPattern.DUCK_CODE_TEST.interfac.MuteQuake;

public class ModelDuck extends  Duck {

    public ModelDuck() {
        flyBehaver = new FlyNoWay();
        quackBeheaver= new MuteQuake();
    }

    @Override
    public void display() {
        System.out.println("저는 진짜 오리여유 여유 여유");
    }
}
