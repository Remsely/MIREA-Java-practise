package practise4_1.Task1_8andEx1;

public class Square extends Rectangle{

    public Square(){
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side);
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String getType() {
        return "Квадрат";
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + super.width +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
