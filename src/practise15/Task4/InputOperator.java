package practise15.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InputOperator {
    private final String result;

    public InputOperator(String input) {
        List<String> resultList = divideByOperations(input);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Expression: " + resultList);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

        evaluateExpression(resultList);

        runMultiplicationAndDivision(resultList);
        System.out.println("After final mulAndDiv: " + resultList);

        runAdditionAndSubtraction(resultList);
        System.out.println("After final addAndSub: " + resultList);

        result = resultList.get(0);
    }

    private ArrayList<String> divideByOperations(String input) {
        ArrayList<String> result = new ArrayList<>();

        int beginIndex = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '/' || input.charAt(i) == '*' || input.charAt(i) == '-' || input.charAt(i) == '+'
                    || input.charAt(i) == '(' || input.charAt(i) == ')') {
                if (i != beginIndex) {
                    result.add(input.substring(beginIndex, i));
                }
                result.add(Character.toString(input.charAt(i)));
                beginIndex = i + 1;
            }
        }
        result.add(input.substring(beginIndex));
        return result;
    }

    private void deleteOperatedElements(int index, List<String> list) {
        for (int i = 0; i < 3; i++) {
            list.remove(index - 1);
        }
    }

    private void runMultiplicationAndDivision(List<String> expression) {
        int divIndex = expression.indexOf("/");
        int mulIndex = expression.indexOf("*");

        boolean divInExp = divIndex != -1;
        boolean mulInExp = mulIndex != -1;

        while (divInExp || mulInExp) {
            if (divInExp && mulInExp && divIndex < mulIndex || !mulInExp) {
                double firstNumber = Double.parseDouble(expression.get(divIndex - 1));
                double secondNumber = Double.parseDouble(expression.get(divIndex + 1));

                deleteOperatedElements(divIndex, expression);
                expression.add(divIndex - 1, Double.toString(firstNumber / secondNumber));
            } else if (!divInExp || divIndex > mulIndex) {
                double firstNumber = Double.parseDouble(expression.get(mulIndex - 1));
                double secondNumber = Double.parseDouble(expression.get(mulIndex + 1));

                deleteOperatedElements(mulIndex, expression);
                expression.add(mulIndex - 1, Double.toString(firstNumber * secondNumber));
            }
            divIndex = expression.indexOf("/");
            mulIndex = expression.indexOf("*");

            divInExp = divIndex != -1;
            mulInExp = mulIndex != -1;

            System.out.println("-------------------------------------------------");
            System.out.println("MulAndDiv iteration: " + expression);
            System.out.println("-------------------------------------------------");
        }
    }

    private void runAdditionAndSubtraction(List<String> expression) {
        int addIndex = expression.indexOf("+");
        int subIndex = expression.indexOf("-");

        boolean addInExp = addIndex != -1;
        boolean subInExp = subIndex != -1;

        while (addInExp || subInExp) {
            if (addInExp && subInExp && addIndex < subIndex || !subInExp) {
                double firstNumber = Double.parseDouble(expression.get(addIndex - 1));
                double secondNumber = Double.parseDouble(expression.get(addIndex + 1));

                deleteOperatedElements(addIndex, expression);
                expression.add(addIndex - 1, Double.toString(firstNumber + secondNumber));
            } else if (!addInExp || addIndex > subIndex) {
                double firstNumber = Double.parseDouble(expression.get(subIndex - 1));
                double secondNumber = Double.parseDouble(expression.get(subIndex + 1));

                deleteOperatedElements(subIndex, expression);
                expression.add(subIndex - 1, Double.toString(firstNumber - secondNumber));
            }
            addIndex = expression.indexOf("+");
            subIndex = expression.indexOf("-");

            addInExp = addIndex != -1;
            subInExp = subIndex != -1;

            System.out.println("-------------------------------------------------");
            System.out.println("AddAndSub iteration: " + expression);
            System.out.println("-------------------------------------------------");
        }
    }

    public void evaluateExpression(List<String> expression) {
        Stack<Integer> stack = new Stack<>();

        int openIndex = expression.indexOf("(");
        int closeIndex = expression.indexOf(")");

        boolean openInExp = openIndex != -1;
        boolean closeInExp = closeIndex != -1;

        while (openInExp || closeInExp) {
            System.out.println("=================================================");
            System.out.println("evaluateExpression iteration");

            if ((openIndex < closeIndex) && openInExp) {
                stack.push(openIndex);
                expression.remove(openIndex);
                System.out.println("Res - " + expression);
            } else {
                expression.remove(closeIndex);
                int startIndex = stack.pop();

                System.out.println("Start index - " + startIndex);
                List<String> subList = expression.subList(startIndex, closeIndex);

                runMultiplicationAndDivision(subList);
                System.out.println("Sub list - " + subList);

                runAdditionAndSubtraction(subList);
                System.out.println("Sub list - " + subList);

                System.out.println("Res - " + expression);
            }
            openIndex = expression.indexOf("(");
            closeIndex = expression.indexOf(")");

            openInExp = openIndex != -1;
            closeInExp = closeIndex != -1;

            System.out.println("=================================================");
        }
    }

    public String getResult() {
        return result;
    }
}
