package chapter5_robot2.baseCode;

public abstract  class Robot {

    private String name;


    public Robot(String name) {
        this.name = name;
    }

    public abstract void attack();
    public abstract void move();

    public String getName() {
        return name;
    }


}
