package practise1;

import java.util.Locale;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        for(int i = 0; i < args.length; i++){
            System.out.println("Аргумент " + (i + 1) +": " + args[i]);
        }
    }
}
