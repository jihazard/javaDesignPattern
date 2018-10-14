package chapter5_robot2.baseCode;

public class Atom extends Robot {
    public Atom(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("아톰 어택!");
    }

    @Override
    public void move() {
        System.out.println("아톰 무브!");
    }
}
