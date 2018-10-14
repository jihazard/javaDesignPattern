package chapter5_robot2.baseCode;

public class TaekwonV extends Robot {


    public TaekwonV(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("태권부이 어택");
    }

    @Override
    public void move() {
        System.out.println("태권부이 무브");

    }
}
