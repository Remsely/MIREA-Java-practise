package practise2.Task3;

public class Circle {
    private Point point;
    private double radius;
    public Circle(double x, double y, double radius){
        this.point = new Point(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                ", radius=" + radius +
                '}';
    }
}
