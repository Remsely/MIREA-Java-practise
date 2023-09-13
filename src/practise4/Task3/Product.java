package practise4.Task3;

public class Product {
    private final String name;
    private final double price;
    private final Category category;

    public Product(String name, double price, Category category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
