package chapter5_robot.ExampleCode.Swing;

import java.awt.*;

public class Ball extends Thread {
    public static final int SIZE = 20;
    public static final int INTERVAL = 10;

    private int x, y;
    private int xInterval, yInterval;
    private DirectionStrategy directionStrategy;
    private DrawStreategy drawStreategy;
    private Color color;

    public Ball(int x ,int y) {
        this.x = x;
        this.y = y;
        this.xInterval = this.yInterval =0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXinterval() {
        return xInterval;
    }

    public int getYinterval() {
        return yInterval;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setInterval(int xInterval, int yInterval){
        this.xInterval = xInterval;
        this.yInterval = yInterval;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public void setDirectionStrategy(DirectionStrategy directionStrategy) {
        this.directionStrategy = directionStrategy;
    }

    public void setDrawStreategy(DrawStreategy drawStreategy) {
        this.drawStreategy = drawStreategy;
    }

    public void draw(){ drawStreategy.draw(this);}
    public void move(){directionStrategy.move(this);}

    public void run(){
        draw();
        move();
        System.out.println("런!");
    }
}
