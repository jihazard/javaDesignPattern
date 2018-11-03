package headFirstDesignPattern.DUCK_CODE_TEST.interfac;

public class FlyWithWings implements  FlyBehaver {
    @Override
    public void fly() {
        System.out.println("날고 있다잉");
    }
}
