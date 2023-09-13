package practise3.Math_and_Random.Task4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    private static int[] getArrayWithEvenNumbers(int[] array){
        int evenCount = 0;

        for(int el : array){
            if(el % 2 == 0)
                evenCount++;
        }

        int[] evenArray = new int[evenCount];
        int index = 0;
        for (int el : array){
            if (el % 2 == 0){
                evenArray[index] = el;
                index ++;
            }
        }

        return evenArray;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        int n;

        do{
            System.out.print("Введите размер массива (натуральное число больше 0): ");
            while (!in.hasNextInt()) {
                System.out.print("Введите корректное число: ");
                in.next();
            }
            n = in.nextInt();
        } while (n <= 0);

        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++)
            array[i] = random.nextInt(n + 1);

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Массив из четных чисел: " + Arrays.toString(getArrayWithEvenNumbers(array)));
    }
}
