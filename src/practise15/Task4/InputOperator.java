package practise15.Task4;

import java.util.ArrayList;

public class InputOperator {
    private final ArrayList<String> resultList;
    private final String result;
    public InputOperator(String input){
        resultList = divideByOperations(input);
        runMultiplicationAndDivision();
        runAdditionAndSubtraction();
        result = resultList.get(0);
    }
    private ArrayList<String> divideByOperations(String input) {
        ArrayList<String> result = new ArrayList<>();
        int beginIndex = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '/' || input.charAt(i) == '*' || input.charAt(i) == '-' || input.charAt(i) == '+') {
                result.add(input.substring(beginIndex, i));
                result.add(Character.toString(input.charAt(i)));
                beginIndex = i + 1;
            }
        }
        result.add(input.substring(beginIndex));
        return result;
    }

    private void deleteOperatedElements(int index){
        for(int i = 0; i < 3; i++){
            resultList.remove(index - 1);
        }
    }

    private void runMultiplicationAndDivision(){
        int divIndex = resultList.indexOf("/");
        int mulIndex = resultList.indexOf("*");
        boolean divInExp = divIndex != -1;
        boolean mulInExp = mulIndex != -1;
        while (divInExp || mulInExp){
            if (divInExp && mulInExp && divIndex < mulIndex || !mulInExp){
                double firstNumber = Double.parseDouble(resultList.get(divIndex - 1));
                double secondNumber = Double.parseDouble(resultList.get(divIndex + 1));
                deleteOperatedElements(divIndex);
                resultList.add(divIndex - 1, Double.toString(firstNumber / secondNumber));
            } else if (!divInExp || divIndex > mulIndex){
                double firstNumber = Double.parseDouble(resultList.get(mulIndex - 1));
                double secondNumber = Double.parseDouble(resultList.get(mulIndex + 1));
                deleteOperatedElements(mulIndex);
                resultList.add(mulIndex - 1, Double.toString(firstNumber * secondNumber));
            }
            divIndex = resultList.indexOf("/");
            mulIndex = resultList.indexOf("*");
            divInExp = divIndex != -1;
            mulInExp = mulIndex != -1;
            System.out.println(resultList);
        }
    }

    private void runAdditionAndSubtraction(){
        int addIndex = resultList.indexOf("+");
        int subIndex = resultList.indexOf("-");
        boolean addInExp = addIndex != -1;
        boolean subInExp = subIndex != -1;
        while (addInExp || subInExp){
            if (addInExp && subInExp && addIndex < subIndex || !subInExp){
                double firstNumber = Double.parseDouble(resultList.get(addIndex - 1));
                double secondNumber = Double.parseDouble(resultList.get(addIndex + 1));
                deleteOperatedElements(addIndex);
                resultList.add(addIndex - 1, Double.toString(firstNumber + secondNumber));
            } else if (!addInExp || addIndex > subIndex){
                double firstNumber = Double.parseDouble(resultList.get(subIndex - 1));
                double secondNumber = Double.parseDouble(resultList.get(subIndex + 1));
                deleteOperatedElements(subIndex);
                resultList.add(subIndex - 1, Double.toString(firstNumber - secondNumber));
            }
            addIndex = resultList.indexOf("+");
            subIndex = resultList.indexOf("-");
            addInExp = addIndex != -1;
            subInExp = subIndex != -1;
            System.out.println(resultList);
        }
    }

    public String getResult() {
        return result;
    }
}
