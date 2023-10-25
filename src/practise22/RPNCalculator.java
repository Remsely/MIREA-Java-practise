package practise22;

import java.util.Scanner;
import java.util.Stack;

public class RPNCalculator {
    private static double evaluateRPN(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split("\\s+");

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else if (isOperator(token)) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperation(token, operand1, operand2);
                stack.push(result);
            } else {
                throw new IllegalArgumentException("Invalid token: " + token);
            }
        }

        if (stack.size() != 1) throw new IllegalArgumentException("Invalid RPn expression");

        return stack.pop();
    }

    private static boolean isNumeric(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isOperator(String token) {
        return "+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token);
    }

    private static double performOperation(String operator, double operand1, double operand2) {
        return switch (operator) {
            case "+" -> operand1 + operand2;
            case "-" -> operand1 - operand2;
            case "*" -> operand1 * operand2;
            case "/" -> {
                if (operand2 == 0) throw new ArithmeticException("Divide by zero");
                yield operand1 / operand2;
            }
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите выражение в обратной польской нотации: ");
        String rpnExpression = scanner.nextLine();

        System.out.println("Результат: " + evaluateRPN(rpnExpression));

    }
}
