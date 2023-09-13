package practise3.Formating_output_strings.Task3;

import java.text.DecimalFormat;

public class Report {
    public static void generateReport(Employee[] employees){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Отчет о сотрудниках:");
        System.out.println("-------------------------------");
        System.out.printf("%-20s %10s%n", "ФИО", "Зарплата");
        System.out.println("-------------------------------");

        for (Employee employee : employees){
            System.out.printf("%-20s %10s%n", employee.getFullName(), decimalFormat.format(employee.getSalary()));
        }
        System.out.println("-------------------------------");
    }
}
