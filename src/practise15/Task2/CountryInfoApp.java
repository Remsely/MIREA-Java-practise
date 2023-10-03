package practise15.Task2;

import javax.swing.*;
import java.awt.*;

public class CountryInfoApp extends JFrame {
    private final JComboBox<String> countryComboBox;
    private final JTextArea countryInfoTextArea;
    private final String[] countryInfos = {
            "Площадь: 17 125 191 км²\nНаселение: 146 599 183 человек",
            "Площадь: 9 525 067 км²\nНаселение: 331 002 651 человек",
            "Площадь: 9 596 961 км²\nНаселение: 1 439 323 776 человек"
    };

    public CountryInfoApp() {
        setTitle("Информация о странах");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        JLabel countryLabel = new JLabel("Выберита страну:");
        String[] countries = {"Выберите страну", "Россия", "США", "Китай"};
        countryComboBox = new JComboBox<>(countries);
        countryInfoTextArea = new JTextArea();

        countryComboBox.addActionListener(e -> {
            int selectedIndex = countryComboBox.getSelectedIndex();
            countryInfoTextArea.setText("");
            if (selectedIndex > 0){
                countryInfoTextArea.append(countryInfos[selectedIndex - 1]);
            }
        });

        JPanel topPanel = new JPanel();
        topPanel.add(countryLabel);
        topPanel.add(countryComboBox);

        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(countryInfoTextArea), BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CountryInfoApp::new);
    }
}
