package chapter3_Solid.LSP.bag_Code;

public class DiscountBag extends  Bag {

    private double discountRate = 0;

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public void applyDicount(int price) {
        super.setPrice(price - (int) (discountRate * price));
    }
}
