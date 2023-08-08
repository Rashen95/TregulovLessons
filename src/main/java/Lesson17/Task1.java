package Lesson17;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("privet");
        System.out.println(ravenstvo(sb1, sb2));
        sb1 = new StringBuilder("privet");
        sb2 = new StringBuilder("poka");
        System.out.println(ravenstvo(sb1, sb2));

    }

    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        return (new String(sb1).equals(new String(sb2)));
    }
}
