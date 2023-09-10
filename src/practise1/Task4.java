package practise1;

import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Введите длинну массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Введите элементы массива: ");

        int i = 0;
        while (i < array.length){
            array[i] = scanner.nextInt();
            sum += array[i];
            if(array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
            i++;
        }

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальные элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
    }
}
