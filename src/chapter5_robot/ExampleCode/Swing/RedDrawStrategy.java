package chapter5_robot.ExampleCode.Swing;

import java.awt.*;

public class RedDrawStrategy extends DrawStreategy {
    @Override
    public void draw(Ball ball) {
        ball.setColor(Color.RED);
    }
}
