package chapter5_robot.basic_Code;

public class TaekwonV extends Robot {
    public TaekwonV(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("주먹 공격!!");
    }

    @Override
    public void move() {
        System.out.println("아톰 날아서 이동");
    }
}
