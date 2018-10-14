package chapter5_robot2.baseCode;

public class Main {
    public static void main(String[] args) {
        Atom atom = new Atom("애톰");
        TaekwonV tv = new TaekwonV("태권부이");

        System.out.println(atom.getName() +" 출격 완료!");
        atom.attack();
        atom.move();

        System.out.println(tv.getName() + "출격 완료!");
        tv.attack();
        tv.move();
    }
}
