public class DiscountCalculator {


    private static final double TWENTY_PERCENT_DISCOUNT = 0.8;
    public DiscountCalculator () {}

    public String healthCheck() {
        return "Checked!";
    }

    public double calculateDiscount(double price) {

        if (price >= 500) {
            if(checkIfPriceIsHigherThan1000(price)) {
                return price*TWENTY_PERCENT_DISCOUNT;
            }
            return price*0.9;
        }
        return price*0.95;
    }

    private boolean checkIfPriceIsHigherThan1000(double price) {
        if(price >= 1000) {
            return true;
        }
        return false;
    }
}
