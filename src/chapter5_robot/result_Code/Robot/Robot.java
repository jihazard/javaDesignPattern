package chapter5_robot.result_Code.Robot;

import chapter5_robot.result_Code.Robot.Attack.AttackStreategy;
import chapter5_robot.result_Code.Robot.Move.MoveStrategy;

public abstract class Robot {
    private String name;
    private MoveStrategy moveStrategy;
    private AttackStreategy attackStreategy;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void move(){moveStrategy.move();}
    public void attack(){attackStreategy.attack();};

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void setAttackStreategy(AttackStreategy attackStreategy) {
        this.attackStreategy = attackStreategy;
    }
}
