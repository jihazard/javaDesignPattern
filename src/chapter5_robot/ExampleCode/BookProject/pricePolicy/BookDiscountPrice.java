package chapter5_robot.ExampleCode.BookProject.pricePolicy;

public class BookDiscountPrice implements  PricePolicy {
    @Override
    public int calPrice(int price, int n) {
        return (int)(price * n * 0.95);
    }
}
