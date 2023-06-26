package order;

import buyer.Buyer;
import product.Categories;
import product.Product;

import java.util.ArrayList;

public class Orders {
    protected ArrayList<Buyer> buyers;
    protected ArrayList<Product> products;
    protected ArrayList<Order> orders;

    public Orders(ArrayList<Buyer> buyers, ArrayList<Product> products) {
        this.buyers = buyers;
        this.products = products;
        orders = new ArrayList<>();
    }

    public ArrayList<Buyer> getBuyers() {
        return buyers;
    }

    public void setBuyers(ArrayList<Buyer> buyers) {
        this.buyers = buyers;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(String phoneNumber, String nameProduct, int quantity, Discount discount) throws CustomerException, ProductException, AmountException, TooMuchSaleException {
        int indexBuyer = -1;
        int indexProduct = -1;
        for (int i = 0; i < buyers.size(); i++) {
            if (buyers.get(i).getPhoneNumber().equals(phoneNumber)) {
                indexBuyer = i;
            }
        }
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getNameProduct().equals(nameProduct)) {
                indexProduct = i;
            }
        }


        if (indexBuyer < 0) {
            throw new CustomerException("Custoner not found");
        }
        if (indexProduct < 0) {
            throw new ProductException("Product not found");
        }
        if (products.get(indexProduct).getCategories() == Categories.PREMIUM) {
            if (discount.getCount() >= 15) throw new TooMuchSaleException("Discount is not found");
        }
        if (quantity >= 100 || quantity < 1) {
            throw new AmountException("Amount is not found");
        }
        orders.add(new Order(buyers.get(indexBuyer), products.get(indexProduct), quantity, products.get(indexProduct).getPrice(), discount));
        System.out.println("Order created");
    }
}

