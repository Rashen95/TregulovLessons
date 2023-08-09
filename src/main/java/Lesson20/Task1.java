package Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
        abc("Z", "A", "X", "B");
    }

    public static ArrayList<String> abc(String... s) {
        ArrayList<String> array = new ArrayList<>();
        for (String s1 : s) {
            if (!array.contains(s1)) {
                array.add(s1);
            }
        }
        Collections.sort(array);
        System.out.println(array);
        return array;
    }
}
