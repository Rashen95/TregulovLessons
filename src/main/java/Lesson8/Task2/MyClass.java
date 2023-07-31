package Lesson8.Task2;

public class MyClass {
    static final double p = 3.14;

    void square(int radius) {
        System.out.println("Площадь: " + radius * radius * p);
    }

    void circumference(int radius) {
        System.out.println("Длина окружности: " + 2 * radius * p);
    }

    void showInfo(int radius) {
        System.out.println("Радиус: " + radius);
        square(radius);
        circumference(radius);
    }
}
