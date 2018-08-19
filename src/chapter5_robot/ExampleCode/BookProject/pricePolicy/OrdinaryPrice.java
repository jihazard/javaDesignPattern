package chapter5_robot.ExampleCode.BookProject.pricePolicy;

public class OrdinaryPrice implements PricePolicy {
    @Override
    public int calPrice(int price, int n) {
        return price * n;
    }
}
