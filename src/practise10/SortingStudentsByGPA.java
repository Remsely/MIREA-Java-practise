package practise10;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingStudentsByGPA {
    private final ArrayList<Student> studentList = new ArrayList<>();

    public void setArray(ArrayList<Student> studentList) {
        this.studentList.addAll(studentList);
    }

    private void quickSortByGPA(){
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getGpa(), s1.getGpa());
            }
        });
    }

    private void mergeSortByGPA(){
        MergeSort.mergeSort(studentList, 0, studentList.size() - 1, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getGpa(), s1.getGpa());
            }
        });
    }

    public void sortByField(Comparator<Student> comparator){
        studentList.sort(comparator);
    }

    private void outArray(){
        for (Student student: studentList) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(new Student("Роман", "Прокопчук", "РПППИС", 2, "ИКБО-01-22", 5.00));
        students1.add(new Student("Федор", "Кумпан", "ИТАЭ", 2, "ИКБО-31-22", 3.80));
        students1.add(new Student("Евгений", "Бекалдиев", "РПППИС", 2, "ИКБО-01-22", 5.00));

        ArrayList<Student> students2 = new ArrayList<>();
        students2.add(new Student("Николай", "Шкабара", "РПППИС", 2, "ИКБО-30-22", 4.80));
        students2.add(new Student("Валера", "Рогоза", "ИТАЭ", 3, "ИКБО-25-21", 3.50));

        SortingStudentsByGPA students = new SortingStudentsByGPA();
        students.setArray(students1);

        students.outArray();
        System.out.println();

        students.quickSortByGPA();
        students.outArray();
        System.out.println();

        students.setArray(students2);
        students.mergeSortByGPA();
        students.outArray();
        System.out.println();
        students.sortByField(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getCourse(), s2.getCourse());
            }
        });

        students.outArray();
    }
}
