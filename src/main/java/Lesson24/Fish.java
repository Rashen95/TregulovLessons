package Lesson24;

public abstract class Fish extends Animal {
    String name;

    public Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void sleep() {
        System.out.println("Vsegda interesno nablyudat, kak spyat ribi");
    }

    public abstract void swim();
}
