package practise5.Task2;

import java.awt.*;

public class Circle extends Shape{
    private final int radius;

    public Circle(Color color, int x, int y, int radius){
        super(color, x, y);
        this.radius = radius;
    }
    @Override
    public void draw(Graphics g) {
        g.fillOval(getX(), getY(), 2 * radius, 2 * radius);
        g.setColor(getColor());
    }
}
