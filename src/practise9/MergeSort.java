package practise9;

import java.util.Comparator;

public class MergeSort {
    public static Student[] mergeSortStudentsByGPA(Student[] students, Comparator<Student> comparator){
        if(students.length <= 1)
            return students;

        int middle = students.length / 2;
        Student[] left = new Student[middle];
        Student[] right = new Student[students.length - middle];

        System.arraycopy(students, 0, left, 0, middle);
        System.arraycopy(students, middle, right, 0, students.length - middle);

        left = mergeSortStudentsByGPA(left, comparator);
        right = mergeSortStudentsByGPA(right, comparator);

        return merge(left, right, comparator);
    }

    public static Student[] merge(Student[] left, Student[] right, Comparator<Student> comparator){
        Student[] result = new Student[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length){
            if (comparator.compare(left[leftIndex], right[rightIndex]) >= 0){
                result[resultIndex] = left[leftIndex];
                leftIndex++;
            } else{
                result[resultIndex] = right[rightIndex];
                rightIndex++;
            }
            resultIndex++;
        }

        while (leftIndex < left.length){
            result[resultIndex] = left[leftIndex];
            leftIndex++;
            resultIndex++;
        }

        while (rightIndex < right.length){
            result[resultIndex] = right[rightIndex];
            rightIndex++;
            resultIndex++;
        }

        return result;
    }
}
