package headFirstDesignPattern.apdaterPattern.duckCodeExample;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("----quack");
    }

    @Override
    public void fly() {
        System.out.println("-----im flying");
    }
}
