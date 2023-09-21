package practise11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.println("Введите день: ");
        int day = scanner.nextInt();
        System.out.println("Введите часы: ");
        int hours = scanner.nextInt();
        System.out.println("Введите минуты: ");
        int minutes = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hours, minutes);
        Date date = calendar.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        String formattedDate = dateFormat.format(date);
        System.out.println(formattedDate);
    }
}
