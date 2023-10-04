package practise12;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapesDrawer extends JFrame {
    private static final int figureAreaHeight = 200;
    private static final int figureAreaWidth = 200;
    private static final int centerX = figureAreaWidth / 2;
    private static final int centerY = figureAreaHeight / 2;

    public RandomShapesDrawer() {
        setTitle("Случайные фигуры");
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridLayout(4, 5));

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int width = random.nextInt(figureAreaHeight - 30);
            int height = random.nextInt(figureAreaWidth - 30);

            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            int shapeType = random.nextInt(100) % 3;

            Shape shape = null;
            switch (shapeType){
                case 0 -> shape = new Circle(color, centerX - width / 2, 100 - width / 2, width / 2);
                case 1 -> shape = new Rectangle(color, centerX - width / 2, 100 - height / 2, width, height);
                case 2 -> {
                    int[] xPoints = {centerX - width / 2, centerX, centerX + width / 2};
                    int[] yPoints = {centerY + height / 2, centerY - height / 2, centerY + height / 2};
                    shape = new Triangle(color, xPoints, yPoints);
                }
                default -> System.out.println("Ошибка!");
            }

            Shape finalShape = shape;
            JPanel shapeContainer = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    finalShape.draw(g);
                }
            };
            shapeContainer.setPreferredSize(new Dimension(200, 200));
            shapeContainer.setBackground(i % 2 == 0 ? Color.black : new Color(15, 15, 15));

            mainPanel.add(shapeContainer);
        }

        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RandomShapesDrawer::new);
    }
}
