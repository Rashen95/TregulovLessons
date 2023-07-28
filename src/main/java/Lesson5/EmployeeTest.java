package Lesson5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Privalov", 45, 45500, "ON");
        Employee e2 = new Employee(1, "Alekseev", 31, 49800, "HEO");
        e1.uvelichenieZPx2();
        e2.uvelichenieZPx2();
        System.out.println("Surname: " + e1.surname + " ZP: " + e1.salary);
        System.out.println("Surname: " + e2.surname + " ZP: " + e2.salary);
    }
}
