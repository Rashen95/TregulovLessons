package Lesson22;

public class Dog extends Pet {
    public Dog(String name) {
        setName("Maffin");
        System.out.println("I am dog and my name is: " + getName());
    }

    public void play() {
        System.out.println("Dog plays");
    }
}
