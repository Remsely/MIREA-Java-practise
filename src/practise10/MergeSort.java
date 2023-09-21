package practise10;

import java.util.ArrayList;
import java.util.Comparator;

public class MergeSort {
    public static void merge(ArrayList<Student> arr, int left, int middle, int right, Comparator<Student> comparator) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        ArrayList<Student> leftArr = new ArrayList<>(n1);
        ArrayList<Student> rightArr = new ArrayList<>(n2);

        for (int i = 0; i < n1; i++) {
            leftArr.add(arr.get(left + i));
        }
        for (int j = 0; j < n2; j++) {
            rightArr.add(arr.get(middle + 1 + j));
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (comparator.compare(leftArr.get(i), rightArr.get(j)) >= 0) {
                arr.set(k, leftArr.get(i));
                i++;
            } else {
                arr.set(k, rightArr.get(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr.set(k, leftArr.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            arr.set(k, rightArr.get(j));
            j++;
            k++;
        }
    }

    public static void mergeSort(ArrayList<Student> arr, int left, int right, Comparator<Student> comparator) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle, comparator);
            mergeSort(arr, middle + 1, right, comparator);
            merge(arr, left, middle, right, comparator);
        }
    }
}
