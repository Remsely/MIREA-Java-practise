package practise2.Task4;

import java.util.Locale;
import java.util.Scanner;

public class KeyboardComputerInput implements ComputerInput{
    private final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    @Override
    public Computer inputComputer() {
        System.out.println("Введите модель компьютера: ");
        String model = scanner.nextLine();
        return new Computer(model);
    }
}
