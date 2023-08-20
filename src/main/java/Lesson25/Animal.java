package Lesson25;

abstract public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

    public abstract void sleep();
}
