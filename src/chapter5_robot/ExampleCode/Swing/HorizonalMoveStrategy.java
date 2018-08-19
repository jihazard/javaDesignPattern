package chapter5_robot.ExampleCode.Swing;

public class HorizonalMoveStrategy extends DirectionStrategy {
    @Override
    public void move(Ball ball) {
       ball.setInterval(Ball.INTERVAL,0);
       while(true){
           ball.setX(ball.getX() + ball.getXinterval());
           if((ball.getX() < 0 && ball.getXinterval() < 0) ||  ball.getX() + Ball.SIZE > BallFrame.WIDTH - 15 && ball.getXinterval() >0){
               ball.setInterval(-ball.getXinterval(),0);
           }else {
               System.out.println("엘슨데?");
           }

           try{
               Thread.sleep(2000);
               ball.run();
               System.out.println("여기런! horizen");
           }catch (InterruptedException e){

           }
       }
    }
}
