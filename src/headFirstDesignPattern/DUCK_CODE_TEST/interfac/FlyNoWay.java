package headFirstDesignPattern.DUCK_CODE_TEST.interfac;

public class FlyNoWay implements  FlyBehaver {
    @Override
    public void fly() {
        System.out.println("저는 못날아요!!!");
    }
}
