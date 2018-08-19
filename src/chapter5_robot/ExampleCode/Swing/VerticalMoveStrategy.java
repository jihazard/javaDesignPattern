package chapter5_robot.ExampleCode.Swing;

public class VerticalMoveStrategy extends DirectionStrategy {
    @Override
    public void move(Ball ball) {
        ball.setInterval(Ball.INTERVAL,0);
        while(true){
            ball.setY(ball.getY() + ball.getYinterval());

            if((ball.getY() < 0 && ball.getYinterval() < 0) ||  ball.getY() + Ball.SIZE > BallFrame.WIDTH - 15 && ball.getYinterval() >0){
                ball.setInterval(-ball.getYinterval(),0);
            }
            try{
                Thread.sleep(30);
            }catch (InterruptedException e){

            }
        }
    }
}