package practise8;

import java.util.Scanner;

public class Task13 {
    public static void skipEvenIndexNumbers(Scanner scanner){
        int oddPositionNumber = scanner.nextInt();

        if(oddPositionNumber != 0){
            System.out.println(oddPositionNumber);

            if(scanner.nextInt() == 0)
                return;

            skipEvenIndexNumbers(scanner);
        }
    }

    public static void main(String[] args) {
        skipEvenIndexNumbers(new Scanner(System.in));
    }
}
