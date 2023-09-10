package practise2.Task8;

import java.util.Arrays;

public class ReverseStringArray {
    private static void reverseArray(String[] arr){
        for(int i = 0; i < arr.length / 2; i++){
            String s = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = s;
        }
    }

    public static void main(String[] args) {
        String[] strArr = {"1", "2", "3", "4", "5"};
        System.out.println("Исходный массив: " + Arrays.toString(strArr));
        reverseArray(strArr);
        System.out.println("Массив после выполнения метода: " + Arrays.toString(strArr));
    }
}
