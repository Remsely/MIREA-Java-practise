package practise3.Formating_output_strings.Task1_and_2;

import java.util.Locale;
import java.util.Scanner;

public class Market {
    private static String[][] products = {
            {"Товар 1", "100.50"},
            {"Товар 2", "200.75"},
            {"Товар 3", "50.20"},
            {"Товар 4", "300.00"}
    };
    private static void printMenu(){
        System.out.println();
        System.out.println("Выберите действие: ");
        System.out.println("1 - вывести асортимент магазина;");
        System.out.println("2 - поменять валюту в ценах;");
        System.out.println("0 - Выйти из программы");
    }

    private static void printAssortment(CurrencyConverter converter){
        System.out.println("----------------------------");
        for (String[] product : products) {
            System.out.println("Наименование товара: " + product[0]);
            System.out.println("Цена товара: " + converter.convertCurrency(Double.parseDouble(product[1])));
            System.out.println();
        }
        System.out.println("----------------------------");
    }
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        converter.chooseCurrency(scanner);

        while (true){
            printMenu();
            int command = scanner.nextInt();

            if(command == 1){
                printAssortment(converter);
            }
            else if (command == 2){
                converter.chooseCurrency(scanner);
            }
            else if(command == 0){
                break;
            }
        }
    }
}
