package chapter5_robot.result_Code.Robot.Move;

public class Walk implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("걸어서 이동");
    }
}
