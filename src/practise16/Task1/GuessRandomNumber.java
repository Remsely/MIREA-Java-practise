package practise16.Task1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GuessRandomNumber extends JFrame {
    private final int maxTries = 3;
    private int remainingTries = maxTries;
    private final int targetNumber;
    private final JTextField textField;

    public GuessRandomNumber() {
        setTitle("Угадай число");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        Random random = new Random();
        targetNumber = random.nextInt(21);

        JLabel label = new JLabel("Введите число (от 1 до 20): ");
        textField = new JTextField(10);
        JButton button = new JButton("Проверить");

        button.addActionListener(e -> runAttempt());

        add(label);
        add(textField);
        add(button);

        setVisible(true);
    }

    private void runAttempt() {
        int guess = Integer.parseInt(textField.getText());
        checkGuess(guess);
    }

    private void checkGuess(int guess) {
        if (guess == targetNumber) {
            JOptionPane.showMessageDialog(this, "Поздравляем! Вы угадали число!");
        } else {
            remainingTries--;
            if (remainingTries > 0) {
                String message = (guess < targetNumber) ? "Вы не угадали! Число больше!" : "Вы не угадали! Число меньше!";
                message += "\nУ вас осталось " + remainingTries + " попыток!";
                JOptionPane.showMessageDialog(this, message);
            } else {
                JOptionPane.showMessageDialog(this, "Вы использовали все попытки. Загаданное число было: " + targetNumber);
            }
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GuessRandomNumber::new);
    }
}
