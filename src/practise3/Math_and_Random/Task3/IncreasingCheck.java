package practise3.Math_and_Random.Task3;

import java.util.Arrays;
import java.util.Random;

public class IncreasingCheck {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random random = new Random();

        for (int i  = 0; i < array.length; i++){
            array[i] = random.nextInt(90) + 10;
        }

        System.out.println("Массив: " + Arrays.toString(array));

        boolean isIncreasing = true;
        for(int i = 1; i < array.length; i++){
            if(array[i] <= array[i - 1]){
                isIncreasing = false;
                break;
            }
        }

        if(isIncreasing)
            System.out.println("Массив строго возрастающий.");
        else
            System.out.println("Массив не является строго возрастающим.");
    }
}
