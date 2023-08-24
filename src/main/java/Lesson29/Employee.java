package Lesson29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {
    public static void printEmployee(Employee e) {
        System.out.println("Name: " + e.name);
        System.out.println("Department: " + e.department);
        System.out.println("Salary: " + e.salary);
        System.out.println("---------------------");
    }

    public static void filtraciyaRabotnikov(ArrayList<Employee> aL, Predicate<Employee> p) {
        for (Employee e : aL) {
            if (p.test(e)) {
                printEmployee(e);
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<Employee> aL = new ArrayList<>();
        aL.add(new Employee("Artem", "IT", 56555));
        aL.add(new Employee("Dasha", "IT", 150));
        aL.add(new Employee("Sergey", "HR", 5655));
        aL.add(new Employee("Gerald", "HR", 156555));
        aL.add(new Employee("Anastasia", "AO", 56555.50));
        aL.add(new Employee("Georg", "Georg", 56555.66));
        aL.add(new Employee("Elena", "HEO", 1556555));
        filtraciyaRabotnikov(aL, x -> x.department.equals("IT") && x.salary > 200);
        filtraciyaRabotnikov(aL, x -> x.name.startsWith("E") && x.salary != 450);
        filtraciyaRabotnikov(aL, x -> x.department.equals(x.name));
    }
}
