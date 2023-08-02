package Lesson11;

public class Car {
    public String color;
    public String engine;
    public int numberOfDoors;

    public Car(String color, String engine, int numberOfDoors) {
        this.color = color;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }

    public void getInfo() {
        System.out.println(this.color + " " + this.engine + " " + this.numberOfDoors);
    }
}
