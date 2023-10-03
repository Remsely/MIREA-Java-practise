package practise15.Task3;

import javax.swing.*;
import java.awt.*;

public class MenuExample extends JFrame {
    private final JTextArea textArea;

    public MenuExample() {
        setTitle("Пример программы с меню");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("Файл");
        JMenu editMenu = new JMenu("Правка");
        JMenu helpMenu = new JMenu("Справка");

        JMenuItem saveMenuItem = new JMenuItem("Сохранить");
        JMenuItem exitMenuItem = new JMenuItem("Выйти");
        JMenuItem copyMenuItem = new JMenuItem("Копировать");
        JMenuItem cutMenuItem = new JMenuItem("Вырезать");
        JMenuItem pasteMenuItem = new JMenuItem("Вставить");
        JMenuItem aboutMenuItem = new JMenuItem("О программе");

        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        editMenu.add(copyMenuItem);
        editMenu.add(cutMenuItem);
        editMenu.add(pasteMenuItem);

        helpMenu.add(aboutMenuItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        textArea = new JTextArea();
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        button1.addActionListener(e -> textArea.append("Нажата кнопка1\n"));

        button2.addActionListener(e -> textArea.append("Нажата кнопка2\n"));

        panel.add(button1);
        panel.add(button2);
        panel.add(textArea);

        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(panel, BorderLayout.NORTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MenuExample::new);
    }
}
