package chapter5_robot2.baseCode.resultCode;

import chapter5_robot2.baseCode.resultCode.inter.FlyStrate;
import chapter5_robot2.baseCode.resultCode.inter.MissleAttack;
import chapter5_robot2.baseCode.resultCode.inter.PunchAttack;
import chapter5_robot2.baseCode.resultCode.inter.WalkingStrate;

public class Main {
    public static void main(String[] args) {
        Atom aa = new Atom("아톰스");
        aa.setMovingStrate(new WalkingStrate());

        System.out.println("로봇의 이름은 ? " + aa.getName());
        aa.move();

        aa.setMovingStrate(new FlyStrate());
        aa.move();

        aa.setAttackStrate(new MissleAttack());
        aa.attack();

        aa.setAttackStrate(new PunchAttack());
        aa.attack();
    }
}
