package chapter5_robot.ExampleCode.BookProject.Domain;

import chapter5_robot.ExampleCode.BookProject.pricePolicy.PricePolicy;

public class Rental {
    private Member member;
    private Book book;

    private PricePolicy pricePolicy;
    int n;

    public Rental(Member member, Book book, PricePolicy pricePolicy, int n) {
        this.member = member;
        this.book = book;
        this.pricePolicy = pricePolicy;
        this.n = n;
    }

    public int getPrice(){
        return pricePolicy.calPrice(book.getPrice(),n);
    }
}
