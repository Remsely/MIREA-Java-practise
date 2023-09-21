package practise9;

import java.util.Comparator;

public class QuickSort {
    public static void quickSortStudentsByGPA(Student[] students, int low, int high, Comparator<Student> comparator){
        if(low < high){
            int pivotIndex = partition(students, low, high, comparator);
            quickSortStudentsByGPA(students, low, pivotIndex - 1, comparator);
            quickSortStudentsByGPA(students, pivotIndex + 1, high, comparator);
        }
    }

    private static int partition(Student[] students, int low, int high, Comparator<Student> comparator){
        Student pivot = students[high];
        int i = low - 1;

        for (int j = low; j < high; j++){
            if(comparator.compare(students[j], pivot) > 0){
                i++;
                swap(students, i, j);
            }
        }

        swap(students, i + 1, high);
        return i + 1;
    }

    private static void swap(Student[] students, int i, int j){
        Student s = students[i];
        students[i] = students[j];
        students[j] = s;
    }
}
