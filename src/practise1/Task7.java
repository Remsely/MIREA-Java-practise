package practise1;

import java.util.Locale;
import java.util.Scanner;

public class Task7 {
    private static void factorial(int n){
        if(n >= 0){
            int result = 1;
            for(int i = 1; i <= n; i++){
                result *= i;
            }
            System.out.println("Результат: " + result);
        }
        else {
            System.out.println("У отрицательного числа нет факториала!");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Введите число, факториал которого вы хотите вычислить: ");
        int n = scanner.nextInt();
        factorial(n);
    }
}
