package chapter5_robot.basic_Code;

public class Atom extends Robot {

    public Atom(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("미사일 공격");

    }

    @Override
    public void move() {
        System.out.println("걸어서 이동");
    }
}
