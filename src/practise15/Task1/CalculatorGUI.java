package practise15.Task1;

import javax.swing.*;
import java.awt.*;

public class CalculatorGUI extends JFrame{
    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField resultField;

    public CalculatorGUI() {
        setTitle("Калькулятор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(5, 2));

        textField1 = new JTextField();
        textField2 = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divideButton = new JButton("/");

        addButton.addActionListener(e -> calculate('+'));
        subtractButton.addActionListener(e -> calculate('-'));
        divideButton.addActionListener(e -> calculate('/'));
        multiplyButton.addActionListener(e -> calculate('*'));

        add(new JLabel("Число 1:"));
        add(textField1);
        add(new JLabel("Число 2:"));
        add(textField2);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(new JLabel("Результат:"));
        add(resultField);

        setVisible(true);
    }

    private void calculate(char operator) {
         try {
             double num1 = Double.parseDouble(textField1.getText());
             double num2 = Double.parseDouble(textField2.getText());
             double result = 0;

             switch (operator) {
                 case '+' -> result = num1 + num2;
                 case '-' -> result = num1 - num2;
                 case '*' -> result = num1 * num2;
                 case '/' -> {
                     if (num2 != 0)
                         result = num1 / num2;
                     else {
                         JOptionPane.showMessageDialog(this, "Ошибка: деление на 0!");
                         clearFields();
                     }
                 }
             }

             resultField.setText(Double.toString(result));
         } catch (NumberFormatException ex) {
             JOptionPane.showMessageDialog(this, "Ошибка: введены некорретные числа!");
             clearFields();
         }
    }

    private void clearFields() {
        textField1.setText("");
        textField2.setText("");
        resultField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalculatorGUI::new);
    }
}
