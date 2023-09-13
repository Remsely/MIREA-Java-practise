package practise4.Task2;

public abstract class Clothes {
    private final ClothingSize size;
    private final double cost;
    private final String color;

    public Clothes(ClothingSize size, double cost, String color){
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public ClothingSize getSize(){
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}
