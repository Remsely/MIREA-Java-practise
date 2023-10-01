package practise5.Task2;

import java.awt.*;

public class Triangle extends Shape{
    private final int[] xPoints;
    private final int[] yPoints;

    public Triangle(Color color, int[] xPoints, int[] yPoints) {
        super(color, xPoints[0], yPoints[0]);
        this.xPoints = xPoints;
        this.yPoints = yPoints;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
