package practise14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String text = "Список цен: 25.98 USD, 500 RUB, 10.5 EUR, 44 ERR, 0.004 EU 25 RUB";

        String regex = "\\b(\\d+(?:\\.\\d+)?)\\s+(USD|RUB|EUR)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group(1) + " " + matcher.group(2));
        }
    }
}
