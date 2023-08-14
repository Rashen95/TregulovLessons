package Lesson22;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("Maffin");
        System.out.println("Количество лап " + d.getName() + " " + d.getPaw());

        System.out.println();

        Cat c = new Cat("Barsic");
        c.sleep();
    }
}
