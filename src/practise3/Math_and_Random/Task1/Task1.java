package practise3.Math_and_Random.Task1;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static double[] generateRandomArrayByMathRandom(int length){
        double[] array = new double[length];
        for (int i = 0; i < length; i++){
            array[i] = Math.random();
        }
        return array;
    }

    public static double[] generateRandomArrayByRandomClass(int length){
        double[] array = new double[length];
        Random random = new Random();
        for (int i = 0; i < length; i++){
            array[i] = random.nextDouble();
        }
        return array;
    }
    public static void main(String[] args) {
        double[] randomArray1 = generateRandomArrayByMathRandom(10);
        double[] randomArray2 = generateRandomArrayByRandomClass(10);

        System.out.println("Массив, сгенерированный с использованием Math.random(): " + Arrays.toString(randomArray1));
        System.out.println("Массив, сгенерированный с использованием класса Random: " + Arrays.toString(randomArray2));

        System.out.println();
        Arrays.sort(randomArray1);
        Arrays.sort(randomArray2);

        System.out.println("Отсортированный массив (с использованием Math.random()): " + Arrays.toString(randomArray1));
        System.out.println("Отсортированный массив (с использованием класса Random): " + Arrays.toString(randomArray2));
    }
}
