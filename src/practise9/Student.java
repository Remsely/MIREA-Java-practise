package practise9;

public class Student implements Comparable<Student> {
    private final int iDNumber;
    private final String name;
    private final double gpa;

    public Student(int iDNumber, String name, double gpa) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.iDNumber, o.iDNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
