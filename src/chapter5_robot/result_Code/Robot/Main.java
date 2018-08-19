package chapter5_robot.result_Code.Robot;

import chapter5_robot.result_Code.Robot.Attack.Missle;
import chapter5_robot.result_Code.Robot.Attack.Punch;
import chapter5_robot.result_Code.Robot.Move.Fly;
import chapter5_robot.result_Code.Robot.Move.Walk;

public class Main {
    public static void main(String[] args) {
        Robot atom = new Atom("아톰");
        Robot tv = new TaekwonV("태권부이");

        tv.setMoveStrategy(new Walk());
        tv.setAttackStreategy(new Missle());

        atom.setAttackStreategy(new Punch());
        atom.setMoveStrategy(new Fly());

        System.out.println("이름은 : " + atom.getName());
        atom.attack();
        atom.move();

        System.out.println("이름은 : " + tv.getName());
        tv.attack();
        tv.move();
    }
}
