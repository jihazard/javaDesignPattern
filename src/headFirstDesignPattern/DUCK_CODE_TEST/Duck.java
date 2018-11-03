package headFirstDesignPattern.DUCK_CODE_TEST;

import headFirstDesignPattern.DUCK_CODE_TEST.interfac.FlyBehaver;
import headFirstDesignPattern.DUCK_CODE_TEST.interfac.QuackBeheaver;

public abstract  class Duck {

    FlyBehaver flyBehaver;
    QuackBeheaver quackBeheaver;

    public Duck() {
    }

    public abstract void display();

    public void performQuack() {
        quackBeheaver.quack();
    }

    public void performFly() {
        flyBehaver.fly();
    }

    public void swim(){
        System.out.println("모든 오르디르은 물에 뜹니다. 가짜오리도 물에 뜨죠잉`!");
    }


    //동적으로 행동을 지정하는 방법
    public void setFlyBehaver (FlyBehaver fly){
        flyBehaver = fly;
    }

    public void setQuackBeheaver(QuackBeheaver quck){
        quackBeheaver = quck;
    }


}
