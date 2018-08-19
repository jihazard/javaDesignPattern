package chapter5_robot.basic_Code;

public class Main {
    public static void main(String[] args) {
        Robot aa = new Atom("아톰");
        System.out.println("나의 이름은  : " + aa.getName());

        aa.attack();
        aa.move();

        aa = new TaekwonV("태권부이");
        System.out.println("나의 이름은  : " + aa.getName());

        aa.getName();
        aa.attack();
        aa.move();

    }
}
