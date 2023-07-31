package Lesson9;

public class Task1 {
    static void createObject() {
        Task1 t1 = new Task1();
        Task1 t2 = new Task1();
    }
    public static void main(String[] args) {
        // Создаем объекты
        Task1 t1 = new Task1();
        Task1 t2 = new Task1();

        // Создаем объекты через методы и они заканчивают свое существование в конце работы методов
        createObject();
        createObject();
        createObject();
    }
}