package chapter5_robot.ExampleCode.Swing;

import java.awt.*;

public class BlueDrawStrategy extends DrawStreategy {
    @Override
    public void draw(Ball ball) {
        ball.setColor(Color.BLUE);
    }
}
