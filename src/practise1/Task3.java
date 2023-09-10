package practise1;

import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
        double sum = 0;

        for (double el : array) {
            sum += el;
        }

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое элементов: " + sum / array.length);
    }
}