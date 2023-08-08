package Lesson18;

public class Task2 {
    public static void main(String[] args) {
        String[][] array = new String[3][];
        array[0] = new String[]{"элемент00", "элемент01"};
        array[1] = new String[]{"элемент10"};
        array[2] = new String[]{"элемент10", "элемент11"};
        showArray(array);
    }

    public static void showArray(String[][] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j == array[i].length - 1) {
                    System.out.print(array[i][j]);
                } else {
                    System.out.print(array[i][j] + ", ");
                }
            }
            if (i == array.length - 1) {
                System.out.print("}");
            } else {
                System.out.print("}, ");
            }
        }
        System.out.print(" }");
    }
}
