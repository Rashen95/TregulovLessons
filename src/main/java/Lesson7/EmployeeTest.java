package Lesson7;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Sergeev"); // Работает так как дефолтный аксес модифаер констуктора видим в данном пакете
        // Employee emp2 = new Employee(1, "Sergeev", 15); Не работает так как данный конструктор private
        Employee emp3 = new Employee(1, "Privalov", 15, 159000, "IT"); // Работает так как конструктор public
        System.out.println(emp3.id); // Работает в данном пакете так как у переменной id дефолтный аксес модифаер
        System.out.println(emp3.surname); // Работает так как переменная surname public
        // System.out.println(emp3.salary); Не работает так как переменная salary private
        emp3.showID();
        emp3.showSurname();
        emp3.showSalary(); // Все три метода работают так как public
    }
}
