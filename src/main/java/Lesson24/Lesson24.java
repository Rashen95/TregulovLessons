package Lesson24;

public class Lesson24 {
    public static void main(String[] args) {
        // 1
        Mechenosec m = new Mechenosec("Karl");
        System.out.println(m.name);
        m.eat();
        m.swim();
        m.sleep();
        System.out.println();
        // 2
        Speakable s = new Pingvin("Serega");
        s.speak();
        System.out.println();
        // 3
        Animal a = new Lev("Leon");
        System.out.println(a.name);
        a.eat();
        a.sleep();
        System.out.println();
        // 4
        Mammal l = new Lev("Arsen");
        System.out.println(l.name);
        l.sleep();
        l.eat();
        l.run();
        l.speak();
    }
}
