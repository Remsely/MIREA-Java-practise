package practise5.Task2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class RandomShapesDrawer extends JFrame {
    private final ArrayList<Shape> shapes;

    public RandomShapesDrawer() {
        setTitle("Случайные фигуры");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        shapes = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(700);
            int y = random.nextInt(500);
            int width = random.nextInt(100);
            int height = random.nextInt(100);

            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            int shape = random.nextInt(3);
            switch (shape){
                case 0 -> shapes.add(new Circle(color, x, y, width));
                case 1 -> shapes.add(new Rectangle(color, x, y, width, height));
                case 2 -> {
                    int[] xPoints = {x, x + width / 2, x + width};
                    int[] yPoints = {y + height, y, y + height};
                    shapes.add(new Triangle(color, xPoints, yPoints));
                }
                default -> System.out.println("Ошибка!");
            }
        }
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Shape shape : shapes){
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RandomShapesDrawer::new);
    }
}
