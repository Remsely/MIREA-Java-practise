package practise5.Task4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;

public class Animation extends JPanel implements ActionListener {
    private final BufferedImage[] animationImages;
    private final int width;
    private final int height;
    private int currentFrame;

    public Animation(String[] imagePaths, int width, int height, int frameDelay){
        animationImages = new BufferedImage[imagePaths.length];
        this.height = height;
        this.width = width;
        for (int i = 0; i < imagePaths.length; i++){
            try{
                animationImages[i] = ImageIO.read(new File(imagePaths[i]));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        int initialDelay = 0;
        Timer timer = new Timer(frameDelay, this);
        timer.setInitialDelay(initialDelay);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(animationImages[currentFrame] != null)
            g.drawImage(animationImages[currentFrame], 0, 0, width, height, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        currentFrame = (currentFrame + 1) % animationImages.length;
        repaint();
    }

    public static void main(String[] args) {
        String fileName = "src\\practise5\\Task4\\config.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            int width = Integer.parseInt(br.readLine());
            int height = Integer.parseInt(br.readLine());
            int animationLength = Integer.parseInt(br.readLine());
            int delay = Integer.parseInt(br.readLine());
            String[] imagePaths = new String[animationLength];

            for (int i = 0; i < animationLength; i++)
                imagePaths[i] = br.readLine();

            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("Анимация из картинок");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                Animation animationPanel = new Animation(imagePaths, width, height, delay);
                frame.add(animationPanel);

                frame.setSize(width + 40, height + 40);
                frame.setVisible(true);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
