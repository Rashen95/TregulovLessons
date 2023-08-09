package Lesson19;

public class Task1 {
    public static void main(String[] args) {
        String[] array = (abc(new String[]{"123", "555"}, new String[]{"123"}));
        for (String s : args) {
            for (int i = 0; i < array.length; i++) {
                if (s.equals(array[i])) {
                    array[i] = null;
                }
            }
        }
        showArray(array);
    }

    public static String[] abc(String[]... s) {
        int sLength = 0;
        for (String[] array : s) {
            sLength += array.length;
        }
        String[] sResult = new String[sLength];
        int bias = 0;
        for (String[] array : s) {
            for (int i = 0; i < array.length; i++) {
                sResult[i + bias] = array[i];
            }
            bias += array.length;
        }
        return sResult;
    }

    public static void showArray(String[] s) {
        for (String s1 : s) {
            System.out.print(s1 + " ");
        }
    }
}
