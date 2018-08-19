package chapter5_robot.ExampleCode;

import chapter5_robot.ExampleCode.Domain.Book;
import chapter5_robot.ExampleCode.Domain.Member;
import chapter5_robot.ExampleCode.Domain.Rental;
import chapter5_robot.ExampleCode.pricePolicy.BookDiscountPrice;
import chapter5_robot.ExampleCode.pricePolicy.MemberDiscountPrice;
import chapter5_robot.ExampleCode.pricePolicy.OrdinaryPrice;

public class Main {
    public static void main(String[] args) {
        Member member = new Member("김득현");


        Book b1 = new Book("이것이자바다",19000,2014);
        Book b2 = new Book("객체지향의 진실과 오해",25000,2012);
        Book b3 = new Book("자바디자인패턴",9000,2011);
        Book b4 = new Book("최범균의개발자가 알아야할 디자인패턴",23000,2018);
        Book b5 = new Book("이것이리눅스다",19000,2019);

        Rental rental = new Rental(member, b1, new MemberDiscountPrice() , 1);
        Rental rental1 = new Rental(member, b1, new OrdinaryPrice() , 1);
        Rental rental2 = new Rental(member, b1, new BookDiscountPrice(), 1);

        System.out.println("렌탄 : " + rental.getPrice());
        System.out.println("렌탄 : " + rental1.getPrice());
        System.out.println("렌탄 : " + rental2.getPrice());

    }
}
