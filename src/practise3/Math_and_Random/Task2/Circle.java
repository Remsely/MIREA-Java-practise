package practise3.Math_and_Random.Task2;

import java.util.Random;

public class Circle {
    private final Point center;
    private final double radius;

    public Circle(Point center){
        Random random = new Random();
        this.center = center;
        this.radius = random.nextDouble() * 10;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumferenceLength(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
