package product;

public class Product {
    protected String nameProduct;
    protected double price;
    protected Categories categories;

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public Product(String nameProduct, double price, Categories categories){
        this.nameProduct = nameProduct;
        this.price = price;
        this.categories = categories;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

