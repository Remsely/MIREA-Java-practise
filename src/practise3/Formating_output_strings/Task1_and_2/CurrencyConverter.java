package practise3.Formating_output_strings.Task1_and_2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
    private final double rateUSD = 97.4;
    private final double rateEUR = 101.56;
    private final double rateGBR = 118.65;
    private final double rateCNY = 12.95;
    private final NumberFormat euro = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    private final NumberFormat dollar = NumberFormat.getCurrencyInstance(Locale.US);
    private final NumberFormat yuan = NumberFormat.getCurrencyInstance(Locale.CHINA);
    private final NumberFormat pound = NumberFormat.getCurrencyInstance(Locale.UK);
    private NumberFormat chosenCurrency = dollar;
    private double chosenRate = rateUSD;

    public String convertCurrency(double rubles){
        return chosenCurrency.format(rubles / chosenRate);
    }

    public void chooseCurrency(Scanner scanner){
        System.out.println("Выберите валюту, в которой будет отображаться стоимость: \n1 - USD;\n2 - EUR;\n3 - GBR;\n4 - CNY\n");
        int currency = scanner.nextInt();
        switch (currency) {
            case 1 -> {
                chosenCurrency = dollar;
                chosenRate = rateUSD;
            }
            case 2 -> {
                chosenCurrency = euro;
                chosenRate = rateEUR;
            }
            case 3 -> {
                chosenCurrency = pound;
                chosenRate = rateGBR;
            }
            case 4 -> {
                chosenCurrency = yuan;
                chosenRate = rateCNY;
            }
        }
    }

    @Override
    public String toString() {
        return dollar.format(1) + " = " + rateUSD + " RUB\n" +
                euro.format(1) + " = " + rateEUR + " RUB\n" +
                pound.format(1) + " = " + rateGBR + " RUB\n" +
                yuan.format(1) + " = " + rateCNY + " RUB\n";
    }
}
