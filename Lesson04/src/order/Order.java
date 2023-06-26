package order;

import buyer.Buyer;
import product.Product;

public class Order {
    protected Buyer bueyr;
    protected Product product;
    protected double price;
    protected Discount discount;
    protected int quantity;

    public Order(Buyer bueyr, Product product, int quantity, double price, Discount discount){
        this.bueyr = bueyr;
        this.product = product;
        this.quantity = quantity;
        this.price = price - discount.amountDiiscount(price);
        this.discount = discount;
    }

    public Buyer getBueyr() {
        return bueyr;
    }

    public void setBueyr(Buyer bueyr) {
        this.bueyr = bueyr;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("Покупатель: " +bueyr.getNameBuyer()+ "\nТовар: " + product.getNameProduct() + "\nКоличество: " + quantity + "\nЦена с учетом скидки: " + price + "\nСкидка: " + discount.getCount());
    }
}
