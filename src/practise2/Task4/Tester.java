package practise2.Task4;

import java.util.Locale;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        while (true){
            Shop shop = new Shop();
            String serialNumber;

            System.out.println("Введите команду: ");
            System.out.println("1 - Добавить компьютер в магазин.");
            System.out.println("2 - Найти компьютер в магазиине.");
            System.out.println("3 - Забрать компьютер из магазина.");
            System.out.println("4 - Завершить работу программы.");

            int command = in.nextInt();
            switch (command){
                case 1:
                    System.out.println("Введите серийный номер компьютера: ");
                    serialNumber = in.next();
                    shop.addComputer(serialNumber);
                    System.out.println("Состояние магазина: " + shop);
                    break;
                case 2:
                    System.out.println("Введите серийный номер компьютера: ");
                    serialNumber = in.next();
                    int searchResult = shop.searchComputer(serialNumber);
                    if (searchResult != -1){
                        System.out.println("Компьютер в наличии в " + searchResult + " ячейке.");
                    }
                    else {
                        System.out.println("Компьютера нет в наличии");
                    }
                    break;
                case 3:
                    System.out.println("Введите серийный номер компьютера: ");
                    serialNumber = in.next();
                    shop.deleteComputer(serialNumber);
                    break;
                case 4:
                    break;
            }
        }
    }
}
