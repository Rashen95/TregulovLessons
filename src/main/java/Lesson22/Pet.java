package Lesson22;

public class Pet extends Animal {

    private String name;
    private final int tail = 1;
    private final int paw = 4;

    public Pet() {
        System.out.println("I am pet");
        setEyes(2);
    }

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet jumps");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTail() {
        return tail;
    }

    public int getPaw() {
        return paw;
    }
}