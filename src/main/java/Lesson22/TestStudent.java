package Lesson22;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName(new StringBuilder("Artem"));
        s1.setCourse(4);
        s1.setGrade(9);
        s1.showInfo();

        System.out.println();

        // Для проверки неверного ввода, неудовлетворяющего условиям
        Student s2 = new Student();
        s2.setCourse(5);
        s2.setGrade(-5);
        s2.setName(new StringBuilder("Ar"));
        s2.showInfo();
    }
}
