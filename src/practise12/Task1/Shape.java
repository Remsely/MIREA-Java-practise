package practise12.Task1;

import javax.swing.*;
import java.awt.*;

abstract class Shape extends JPanel {
    private final Color color;
    private final int x;
    private final int y;

    public Shape(Color color, int x, int y){
        this.color = color;
        this.x = x;
        this.y = y;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public abstract void draw(Graphics g);

    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
