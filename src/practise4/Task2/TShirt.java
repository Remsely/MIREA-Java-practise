package practise4.Task2;

public class TShirt extends Clothes implements MenClosing, WomenClosing{

    public TShirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужик одел футболку");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женищина одела футболку");
    }
}
