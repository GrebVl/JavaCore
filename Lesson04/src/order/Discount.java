package order;

public enum Discount {
    DISCOUNT_0(0),
    DISCOUNT_5(5),
    DISCOUNT_10(10),
    DISCOUNT_15(15),
    DISCOUNT_20(20);
    public final int count;

    Discount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public double amountDiiscount(double price){
        return (price*count)/100;
    }
}
