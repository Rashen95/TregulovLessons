package Lesson16;

public class Task1 {
    public static void main(String[] args) {
        email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }

    public static void email(String s1) {
        String output;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '@') {
                output = s1.substring(i + 1, s1.indexOf('.', i + 1));
                System.out.println(output);
            }
        }
    }
}