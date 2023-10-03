package practise15.Task4;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    private final JTextArea textArea;
    private final JButton button1;
    private final JButton button2;
    private final JButton button3;
    private final JButton button4;
    private final JButton button5;
    private final JButton button6;
    private final JButton button7;
    private final JButton button8;
    private final JButton button9;
    private final JButton button0;
    private final JButton additionButton;
    private final JButton subtractionButton;
    private final JButton multiplicationButton;
    private final JButton divisionButton;
    private final JButton resultButton;
    private final JButton pointButton;
    private final StringBuilder resultLine = new StringBuilder();

    public Calculator() {
        setTitle("Remsely Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 350);

        textArea = new JTextArea();
        textArea.setBackground(Color.black);
        textArea.setForeground(Color.white);
        textArea.setFont(new Font("Open Sans", Font.BOLD, 22));
        textArea.enableInputMethods(false);

        button0 = new CustomButton("0");
        button1 = new CustomButton("1");
        button2 = new CustomButton("2");
        button3 = new CustomButton("3");
        button4 = new CustomButton("4");
        button5 = new CustomButton("5");
        button6 = new CustomButton("6");
        button7 = new CustomButton("7");
        button8 = new CustomButton("8");
        button9 = new CustomButton("9");
        additionButton = new CustomButton("+");
        subtractionButton = new CustomButton("-");
        multiplicationButton = new CustomButton("*");
        divisionButton = new CustomButton("/");
        resultButton = new CustomButton("=");
        pointButton = new CustomButton(".");

        setActionListeners();

        JPanel panel = new JPanel(new GridLayout(4, 0));

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(divisionButton);

        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(multiplicationButton);

        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(subtractionButton);

        panel.add(pointButton);
        panel.add(button0);
        panel.add(resultButton);
        panel.add(additionButton);

        add(panel, BorderLayout.SOUTH);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        setMinimumSize(new Dimension(300, 300));
        setVisible(true);
    }

    private void setActionListeners() {
        button0.addActionListener(e -> run0());
        button1.addActionListener(e -> run1());
        button2.addActionListener(e -> run2());
        button3.addActionListener(e -> run3());
        button4.addActionListener(e -> run4());
        button5.addActionListener(e -> run5());
        button6.addActionListener(e -> run6());
        button7.addActionListener(e -> run7());
        button8.addActionListener(e -> run8());
        button9.addActionListener(e -> run9());
        additionButton.addActionListener(e -> runAddition());
        subtractionButton.addActionListener(e -> runSubtraction());
        multiplicationButton.addActionListener(e -> runMultiplication());
        divisionButton.addActionListener(e -> runDivision());
        resultButton.addActionListener(e -> runResult());
        pointButton.addActionListener(e -> runPoint());
    }

    private void run0() {
        textArea.append("0");
        resultLine.append("0");
    }

    private void run1() {
        textArea.append("1");
        resultLine.append("1");
    }

    private void run2() {
        textArea.append("2");
        resultLine.append("2");
    }

    private void run3() {
        textArea.append("3");
        resultLine.append("3");
    }

    private void run4() {
        textArea.append("4");
        resultLine.append("4");
    }

    private void run5() {
        textArea.append("5");
        resultLine.append("5");
    }

    private void run6() {
        textArea.append("6");
        resultLine.append("6");
    }

    private void run7() {
        textArea.append("7");
        resultLine.append("7");
    }

    private void run8() {
        textArea.append("8");
        resultLine.append("8");
    }

    private void run9() {
        textArea.append("9");
        resultLine.append("9");
    }

    private void runPoint() {
        textArea.append(".");
        resultLine.append(".");
    }

    private void runAddition() {
        textArea.append(" + ");
        resultLine.append("+");
    }

    private void runSubtraction() {
        textArea.append(" - ");
        resultLine.append("-");
    }

    private void runMultiplication() {
        textArea.append(" * ");
        resultLine.append("*");
    }

    private void runDivision() {
        textArea.append(" / ");
        resultLine.append("/");
    }

    private void runResult() {
        try{
            InputOperator inputOperator = new InputOperator(resultLine.toString());
            textArea.setText("= " + inputOperator.getResult());
            resultLine.delete(0, resultLine.length());
            resultLine.append(inputOperator.getResult());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ошибка: введены некорректные данные!");
            textArea.setText("");
            resultLine.delete(0, resultLine.length());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Calculator::new);
    }
}
