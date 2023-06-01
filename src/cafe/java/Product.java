package cafe.java;


public class Product extends Menu {
    private double price;

    public Product(String name, String detail, double price) {
        super(name, detail);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}


