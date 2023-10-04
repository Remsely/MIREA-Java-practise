package practise16.Task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdministrativeDistricts extends JFrame {
    private JPanel centralPanel;
    private JPanel westPanel;
    private JPanel eastPanel;
    private JPanel southPanel;
    private JPanel northPanel;

    public AdministrativeDistricts() {
        setTitle("Административные округа");

        initPanels();

        addListeners();

        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initPanels() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        westPanel = new JPanel();
        westPanel.setBackground(Color.red);
        panel.add(westPanel, BorderLayout.WEST);

        eastPanel = new JPanel();
        eastPanel.setBackground(Color.blue);
        panel.add(eastPanel, BorderLayout.EAST);

        northPanel = new JPanel();
        northPanel.setBackground(Color.yellow);
        add(northPanel, BorderLayout.NORTH);

        southPanel = new JPanel();
        southPanel.setBackground(Color.green);
        add(southPanel, BorderLayout.SOUTH);

        centralPanel = new JPanel();
        centralPanel.setBackground(Color.white);
        panel.add(centralPanel, BorderLayout.CENTER);

        add(panel);
    }

    private void addListeners() {
        centralPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(centralPanel, "Добро пожаловать в ЦАО");
            }
        });

        westPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(westPanel, "Добро пожаловать в ЗАО");
            }
        });


        southPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(southPanel, "Добро пожаловать в ЮАО");
            }
        });


        northPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(northPanel, "Добро пожаловать в САО");
            }
        });

        eastPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(eastPanel, "Добро пожаловать в ВАО");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AdministrativeDistricts::new);
    }
}
