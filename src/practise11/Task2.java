package practise11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");


        System.out.println("Введите время в формате \"dd.MM.yyyy HH:mm:ss\"");
        String inputDateString = scanner.nextLine();

        try {
            Date inputDate = dateFormat.parse(inputDateString);
            Date currentDate = new Date();
            if (currentDate.before(inputDate))
                System.out.println("Вы ввели дату и время, которые следуют за датой и временем запуска программы.");
            else if (currentDate.after(inputDate))
                System.out.println("Вы ввели дату и время, которые предшествуют дате и времени запуска программы.");
            else
                System.out.println("Вы ввели дату и время, которые совпадают с датой и временем запуска программы.");
        } catch (ParseException e) {
            System.out.println("Вы ввели данные в некорректном формате!");
        }
    }
}
