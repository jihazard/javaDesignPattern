package chapter5_robot.ExampleCode.Swing;

public class Main {
    private static final int INIT[] = {50,100,150,200,250};

    public static void main(String[] args) {
        Ball[] balls = new Ball[5];
        for(int i=0; i<balls.length;i++){
            balls[i] = new Ball(INIT[i],INIT[i]);
            balls[i].setDirectionStrategy(new HorizonalMoveStrategy());
            balls[i].setDrawStreategy(new RedDrawStrategy());

            balls[i].start();



        }
        new BallFrame(balls);
    }
}
