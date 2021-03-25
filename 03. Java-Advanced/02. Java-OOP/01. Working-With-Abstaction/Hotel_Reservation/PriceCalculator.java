package Hotel_Reservation;

public class PriceCalculator {
    private double pricePerDay;
    private int numDays;
    private Season season;
    private Discount discount;

    public PriceCalculator(double pricePerDay, int numDays, Season season, Discount discount) {
        this.pricePerDay = pricePerDay;
        this.numDays = numDays;
        this.season = season;
        this.discount = discount;
    }

    public double calculate() {
        return ((this.pricePerDay * this.season.getMultiplier()) * this.numDays)
                * (1.0 - (this.discount.getDiscountPercent() / 100.0));
    }
}
