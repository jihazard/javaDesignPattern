package chapter5_robot2.baseCode.resultCode;

import chapter5_robot2.baseCode.resultCode.inter.AttackStrate;
import chapter5_robot2.baseCode.resultCode.inter.MovingStrate;

public abstract class Robot {
    private String name;
    private MovingStrate movingStrate;
    private AttackStrate attackStrate;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void move(){
        movingStrate.move();
    }

    public void attack(){
        attackStrate.attack();
    }

    public void setAttackStrate(AttackStrate attackStrate) {
        this.attackStrate = attackStrate;
    }

    public void setMovingStrate(MovingStrate movingStrate) {
        this.movingStrate = movingStrate;
    }


}

