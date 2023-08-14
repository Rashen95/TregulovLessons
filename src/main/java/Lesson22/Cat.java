package Lesson22;

public class Cat extends Pet {
    public Cat(String name) {
        setName("Barsic");
        System.out.println("I am cat and my name is: " + getName());
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}
