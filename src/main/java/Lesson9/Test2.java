package Lesson9;

class Test2 {
    int a = 1;
    static int b = 2;

    static void abc(final int a) {
        System.out.println(a); // Выдаст 5, так как передана аргументом в методе мейн
        System.out.println(Test2.b); // Выдаст 2, так как обращается к статической переменной класса Test2 (можно было просто указать как "b")
    }

    public static void main(String[] args) {
        abc(5);
    }
}