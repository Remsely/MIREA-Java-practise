package practise15.Task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CustomButton extends JButton {
    public CustomButton(String label) {
        super(label);

        setContentAreaFilled(false);
        setOpaque(true);
        setBackground(Color.black);
        setForeground(Color.white);
        setFocusPainted(false);
        setMargin(new Insets(10, 5, 5, 10));
        setFont(new Font("Open Sans", Font.BOLD, 22));
        setPreferredSize(new Dimension(80, 40));
        setBorderPainted(false);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                setBackground(new Color(16, 16, 16));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                setBackground(Color.black);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                setBackground(new Color(25, 25, 25));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                setBackground(new Color(16, 16, 16));
            }
        });
    }
}
