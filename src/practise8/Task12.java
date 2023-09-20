package practise8;

import java.util.Scanner;

public class Task12 {
    private static void printOddNumbers(Scanner scanner){
        int num = scanner.nextInt();

        if(num != 0){
            if(num % 2 == 1)
                System.out.println(num);
            printOddNumbers(scanner);
        }
    }

    public static void main(String[] args) {
        printOddNumbers(new Scanner(System.in));
    }
}
