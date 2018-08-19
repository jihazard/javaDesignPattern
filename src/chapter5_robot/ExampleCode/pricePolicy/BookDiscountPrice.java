package chapter5_robot.ExampleCode.pricePolicy;

public class BookDiscountPrice implements  PricePolicy {
    @Override
    public int calPrice(int price, int n) {
        return (int)(price * n * 0.95);
    }
}
