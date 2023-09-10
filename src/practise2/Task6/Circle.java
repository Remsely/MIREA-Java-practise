package practise2.Task6;

import static java.lang.Math.abs;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            System.out.println("Радиус окружности должен быт положительным!");
            if (radius == 0)
                this.radius = 1;
            else
                this.radius = abs(radius);
        }
        else{
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.out.println("Радиус окружности должен быт положительным!");
            if (radius == 0)
                this.radius = 1;
            else
                this.radius = abs(radius);
        }
        else{
            this.radius = radius;
        }
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumferenceLength() {
        return 2 * Math.PI * radius;
    }

    public boolean isEqualTo(Circle otherCircle) {
        return this.radius == otherCircle.radius;
    }
}
