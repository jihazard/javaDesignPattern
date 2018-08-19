package chapter5_robot.ExampleCode.Domain;

public class Book {
    private String name;
    private int price;
    private int publishYear;

    public Book(String name, int price, int publishYear) {
        this.name = name;
        this.price = price;
        this.publishYear = publishYear;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getPublishYear() {
        return publishYear;
    }
}
