package Lesson11;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("White", "V6", 4);
        Car c2 = new Car("Red", "V8", 2);
        changeNumberOfDoors(c1, 15);
        colorSwap(c1, c2);
        c1.getInfo();
        c2.getInfo();
    }

    public static void changeNumberOfDoors(Car c, int number) {
        c.numberOfDoors = number;
    }

    public static void colorSwap(Car c1, Car c2) {
        String temp = c1.color;
        c1.color = c2.color;
        c2.color = temp;
    }
}
