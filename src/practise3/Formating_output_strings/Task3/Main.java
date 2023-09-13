package practise3.Formating_output_strings.Task3;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Вася Пупкин", 350500),
                new Employee("Иван Иванов", 280000.5232),
                new Employee("Иван Дурачек", 420000.7455),
                new Employee("Алексей Попов", 75000.34375)
        };

        Report.generateReport(employees);
    }
}
