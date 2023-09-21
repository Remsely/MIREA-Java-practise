package practise9;

public class InsertionSort {
    public static void insertionSortByID(Student[] students){
        for(int i = 1; i < students.length; i++){
            Student currentStudent = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].compareTo(currentStudent) > 0) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = currentStudent;
        }
    }
}
