package Hotel_Reservation;

public enum Discount {
    VIP(20),
    SECONDVISIT(10),
    NONE(0);

    private final int discountPercent;

    Discount(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
