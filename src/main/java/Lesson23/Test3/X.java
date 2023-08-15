package Lesson23.Test3;

public class X {
    public X() {
        System.out.println("X");
    }

    public X(int i) {
        System.out.println("X" + i);
    }

    private boolean abc() {
        return false;
    }

    public static void main(String[] args) {
        X x = new Y(18); // Выведет X потом Y
        System.out.println(x.abc()); // Выведет false
    }
}

class Y extends X {
    public Y(int i) {
        System.out.println("Y");
    }

    public boolean abc() {
        return true;
    }
}
