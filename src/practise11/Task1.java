package practise11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        String developerName = "remsely";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        String taskRecievedDateString = "21.09.2023 17:00:00";
        Date taskSubmitionDate = new Date();
        String taskSubmitionDateString = dateFormat.format(taskSubmitionDate);

        System.out.println(developerName);
        System.out.println(taskRecievedDateString);
        System.out.println(taskSubmitionDateString);
    }
}
