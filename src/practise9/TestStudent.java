package practise9;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students1 = {
                new Student(3, "Рома", 5.00),
                new Student(4, "Женя", 4.90),
                new Student(2, "Даня", 5.00),
                new Student(1, "Миша", 4.75),
                new Student(5, "Коля", 4.50)
        };

        for (Student student: students1) {
            System.out.println(student);
        }
        System.out.println();

        InsertionSort.insertionSortByID(students1);

        for (Student student: students1) {
            System.out.println(student);
        }

        System.out.println();

        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        QuickSort.quickSortStudentsByGPA(students1, 0, students1.length - 1, comparator);

        for (Student student: students1) {
            System.out.println(student);
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println();

        Student[] students2 = {
                new Student(10, "Кирилл", 4.00),
                new Student(6, "Гоша", 5.00),
                new Student(9, "Леша", 4.25),
                new Student(7, "Таня", 5.00),
                new Student(8, "Никита", 4.10),
        };

        for (Student student: students2) {
            System.out.println(student);
        }

        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println();

        Student[] studentsAll = MergeSort.merge(students1, students2, comparator);

        for (Student student: studentsAll) {
            System.out.println(student);
        }
        System.out.println();

        Student[] sortedStudentsAll = MergeSort.mergeSortStudentsByGPA(studentsAll, comparator);

        for (Student student: sortedStudentsAll) {
            System.out.println(student);
        }
        System.out.println();

    }
}
