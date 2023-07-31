package Lesson9;

class Test3 {
    int a = 1;
    static int b = 2;

    void abc(int a) {
        System.out.println(b); // Выдаст 2, так как обращается к переменной b в собственном классе
        System.out.println(a); // Выдаст 4, так как передана аргументом в методе мейн
        System.out.println(this.a); // Выдаст 1, так как обращается к переменной экземпляра класса
        System.out.println(Test3.b); // Выдаст 2, так как запись аналогична 8 строке (можно указывать имя класса, а можно и нет)
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(4);
    }
}