package practise2.Task4;

import java.util.Locale;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        Shop shop = new Shop();
        ComputerInput input = new KeyboardComputerInput();

        for(int i = 0; i < 3; i++){
            Computer computer = input.inputComputer();
            shop.addComputer(computer);
        }

        System.out.println("Введите модель нужного вам компьютера: ");
        String searchModel = in.nextLine();
        Computer foundComputer = shop.findComputer(searchModel);

        if(foundComputer != null){
            System.out.println("Компьютер найден: " + foundComputer.toString());
            shop.removeComputer(foundComputer);
        }

        else
            System.out.println("Компьютер не найден!");

        System.out.print("Состояние магазина: " + shop);


    }
}
