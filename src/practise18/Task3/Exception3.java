package practise18.Task3;

import java.util.Scanner;

public class Exception3 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
        } catch (Exception e) {
            System.out.println("exception");
        } //catch (NumberFormatException e) {
//            System.out.println("incorrect number format");
//        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}

// 1) Не компилируется))) java: exception java.lang.NumberFormatException has already been caught