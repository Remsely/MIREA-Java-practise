package practise14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 { // Непонятная формулировка задачи
    public static void main(String[] args) {
        String text = "(1 + 8) - 9 / 4";
        String regex = "\\d+\\s*\\+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println(matcher.find());
    }
}
