package Lesson24;

public abstract class Bird extends Animal implements Speakable {
    String name;

    public Bird(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println(this.name + " sings");
    }

    public abstract void fly();
}
