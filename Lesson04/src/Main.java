import java.util.ArrayList;

import buyer.*;
import order.*;
import product.*;

public class Main {
    public static void main(String[] args) throws CustomerException, AmountException, ProductException {

        ArrayList<Buyer> buyers = new ArrayList<Buyer>();
        buyers.add(new Buyer("Ivan Semenov", 35, Gender.valueOf("MAN"), "+79998886644"));
        buyers.add(new Buyer("Aleks Petrov", 25, Gender.valueOf("MAN"), "+79997775533"));

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("Milk", 100.5, Categories.STANDARD));
        products.add(new Product("Tea", 250, Categories.STANDARD));
        products.add(new Product("Coffee", 350, Categories.PREMIUM));
        products.add(new Product("Soda", 100, Categories.STANDARD));
        products.add(new Product("Chocolate", 155.9, Categories.PREMIUM));

        Orders orders = new Orders(buyers, products);

        String[] phone = {"+79998886644", "+79997775533", "+79997775533", "+79997775533", "+79997775511"};
        String[] product = {"Tea", "cake", "Milk", "Coffee", "Chocolate"};
        int[] quantity = {4, 5, 101, 0, -1};
        Discount[] discounts = {Discount.DISCOUNT_0, Discount.DISCOUNT_5, Discount.DISCOUNT_10, Discount.DISCOUNT_15, Discount.DISCOUNT_20};
        int count = 0;


        for (int i = 0; i < phone.length; i++) {
            try {
                orders.addOrder(phone[i], product[i], quantity[i], discounts[i]);
                count++;
            } catch (AmountException e) {
                orders.addOrder(phone[i], product[i], 1, discounts[i]);
                System.out.println("колическтво " + quantity[i] + " изменен на 1");
                count++;
            } catch (TooMuchSaleException e) {
                System.out.println(e.getMessage() + " цену товара не менять");
            } catch (ProductException | CustomerException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(count);

        for (Order r : orders.getOrders()) {
            System.out.println(r.toString() + "\n");
        }

    }
}