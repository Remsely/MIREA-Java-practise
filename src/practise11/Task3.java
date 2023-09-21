package practise11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task3 {
    private String name;
    private String surname;
    private final Date dateOfBirth;
    private String specialization;
    private int course;
    private String group;
    private double gpa;

    public Task3(String name, String surname, String specialization, int course, String group, double gpa, Date dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
        this.dateOfBirth = dateOfBirth;
    }

    public double getGpa() {
        return gpa;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getSurname() {
        return surname;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString(String dateFormatPattern) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatPattern);
        return "Task3{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateFormat.format(dateOfBirth) +
                ", specialization='" + specialization + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date dateOfBirth = dateFormat.parse("25.12.2004");
        Task3 task3 = new Task3("Роман", "Прокопчук", "РПППИС", 2, "ИКБО-01-22", 5.00, dateOfBirth);
        System.out.println(task3.toString("dd.MM.yyyy"));
    }
}
