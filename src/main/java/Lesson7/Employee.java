package Lesson7;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    Employee(int id, String surname) {
        this(id, surname, 0, 0, null);
    }

    private Employee(int id, String surname, int age) {
        this(id, surname, age, 0, null);
    }

    public void showID() {
        System.out.println(this.id);
    }

    public void showSurname() {
        System.out.println(this.surname);
    }

    public void showSalary() {
        System.out.println(this.salary);
    }
}
