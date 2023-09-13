package practise4.Task2;

public class Pants extends Clothes implements MenClosing, WomenClosing{

    public Pants(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужик одел штаны");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женищина одела штаны");
    }
}
