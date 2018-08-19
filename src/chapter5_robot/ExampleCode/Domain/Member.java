package chapter5_robot.ExampleCode.Domain;

public class Member {
    private String name;
    private int totalPrice;

    public Member(String name) {
        this.name = name;
        this.totalPrice=0;
    }

    public String getName() {
        return name;
    }

    public void addPrice(int price){
        this.totalPrice += price;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
