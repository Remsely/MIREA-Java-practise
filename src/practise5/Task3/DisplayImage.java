package practise5.Task3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DisplayImage extends JPanel {
    private final BufferedImage image;
    private final int width;
    private final int height;

    public DisplayImage(String imagePath, int width, int height){
        this.height = height;
        this.width = width;
        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(image != null)
            g.drawImage(image, 0, 0, width, height, this);
    }

    public static void main(String[] args) {
        StringBuilder imagePath = new StringBuilder();
        for(int i = 0; i < args.length; i++){
            imagePath.append(args[i]);
            if(i != args.length - 1)
                imagePath.append(" ");
        }

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Картинка из аргумента");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            DisplayImage imagePanel = new DisplayImage(imagePath.toString(), 800, 600);
            frame.add(imagePanel);

            frame.setVisible(true);
        });
    }
}
