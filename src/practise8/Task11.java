package practise8;

import java.util.Scanner;

public class Task11 {
    public static int countOnes(Scanner scanner){
        int number = scanner.nextInt();

        if(number == 0){
            int nextNumber = scanner.nextInt();
            if(nextNumber == 0)
                return 0;
            else
                return (nextNumber == 1 ? 1 : 0) + countOnes(scanner);
        }
        else {
            return (number == 1 ? 1 : 0) + countOnes(scanner);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = countOnes(scanner);
        System.out.println(count);
    }
}
