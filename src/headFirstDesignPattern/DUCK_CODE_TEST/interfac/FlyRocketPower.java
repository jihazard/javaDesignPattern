package headFirstDesignPattern.DUCK_CODE_TEST.interfac;

public class FlyRocketPower implements  FlyBehaver {
    @Override
    public void fly() {
        System.out.println("로켓 추진으로 날아갑니다.~! ");
    }
}
