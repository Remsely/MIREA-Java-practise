package practise2.Task10;

import java.util.Locale;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Введите текст: ");
        String text = in.nextLine();

        String[] words = text.split(" ");
        int counter = 0;
        for(String word : words){
            if(!word.equals(""))
                counter++;
        }
        System.out.println("Кол-во слов в тексте: " + counter);
    }
}
