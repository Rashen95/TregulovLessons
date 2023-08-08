package Lesson18;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] array1 = {5, -8, 10, 15, 0, 10};
        System.out.println(Arrays.toString(sortirovka(array1)));
    }

    public static int[] sortirovka(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexMin]) {
                    indexMin = j;
                }
            }
            int temp = array[i];
            array[i] = array[indexMin];
            array[indexMin] = temp;
        }
        return array;
    }
}
