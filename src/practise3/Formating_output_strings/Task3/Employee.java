package practise3.Formating_output_strings.Task3;

public class Employee {
    private final String fullName;
    private final double salary;

    Employee(String fullName, double salary){
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }
}
