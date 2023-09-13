package practise4.Task2;

public class Skirt extends Clothes implements WomenClosing{
    public Skirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одела юбку");
    }
}
