package practise4.Task2;

public class Tie  extends Clothes implements MenClosing{

    public Tie(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужик надел галстук");
    }
}
