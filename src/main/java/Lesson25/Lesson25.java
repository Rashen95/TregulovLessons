/**
 * Не понятно почему Трегулов не поместил в первый массив объекты на которые ссылаются переменные s1 и s2 ведь,
 * несмотря на то что на них ссылается переменная Speakable, они являются Animal (я поместил их в массив с помощью downcasting).
 * <p>
 * Также не понятно почему Трегулов не поместил во второй массив объекты на которые ссылаются переменные a1 и a1, ведь,
 * несмотря на то что на них ссылается переменная Animal, они являются Speakable (я поместил их в массив с помощью downcasting).
 */

package Lesson25;

public class Lesson25 {
    public static void main(String[] args) {
        Animal a1 = new Lev("Lev1");
        Animal a2 = new Mechenosec("Mechenosec1");
        Animal a3 = new Pingvin("Pingvin1");
        Bird b1 = new Pingvin("Pingvin2");
        Fish f1 = new Mechenosec("Mechenosec2");
        Mammal m1 = new Lev("Lev2");
        Lev l1 = new Lev("lev3");
        Mechenosec mech1 = new Mechenosec("Mechenosec3");
        Pingvin p1 = new Pingvin("Pingvin3");
        Speakable s1 = new Lev("Lev4");
        Speakable s2 = new Pingvin("Pingvin4");

        Animal[] array1 = {a1, a2, a3, b1, f1, m1, l1, mech1, p1, (Animal) s1, (Animal) s2};
        Speakable[] array2 = {(Speakable) a1, (Speakable) a3, b1, m1, l1, p1, s1, s2};
        for (Animal a : array1) {
            if (a instanceof Lev) {
                System.out.println(((Lev) a).name);
                a.eat();
                a.sleep();
                ((Lev) a).run();
                ((Lev) a).speak();
                System.out.println();
            } else if (a instanceof Mechenosec) {
                System.out.println(((Mechenosec) a).name);
                a.eat();
                a.sleep();
                ((Mechenosec) a).swim();
                System.out.println();
            } else if (a instanceof Pingvin) {
                System.out.println(((Pingvin) a).name);
                a.eat();
                a.sleep();
                ((Pingvin) a).speak();
                ((Pingvin) a).fly();
                System.out.println();
            }
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        for (Speakable s : array2) {
            if (s instanceof Lev) {
                System.out.println(((Lev) s).name);
                ((Lev) s).eat();
                ((Lev) s).sleep();
                ((Lev) s).run();
                s.speak();
                System.out.println();
            } else if (s instanceof Pingvin) {
                System.out.println(((Pingvin) s).name);
                ((Pingvin) s).eat();
                ((Pingvin) s).sleep();
                s.speak();
                ((Pingvin) s).fly();
                System.out.println();
            }
        }
    }
}
