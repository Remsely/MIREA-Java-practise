package practise6.Task11;

public class Main implements Convertable{
    @Override
    public double convertCelsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    @Override
    public double convertFahrenheitsToCelsius(double fahrenheits) {
        return (fahrenheits - 32) / 1.8;
    }

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.convertCelsiusToFahrenheit(100));
        System.out.println(main.convertFahrenheitsToCelsius(212));
    }
}
