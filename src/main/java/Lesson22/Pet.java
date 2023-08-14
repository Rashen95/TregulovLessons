package Lesson22;

public class Pet extends Animal {

    private String name;
    private int tail = 1;
    private int paw = 4;

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
        if (this.name != null) {
            return new String(this.name);
        }
        return null;
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

    public void setTail(int tail) {
        this.tail = tail;
    }

    public void setPaw(int paw) {
        this.paw = paw;
    }
}