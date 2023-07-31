package Lesson9;

class Test1 {
    int a = 1;
    // static int a = 2; Имя переменной "a" уже занято

    void abc(int a) {
        System.out.println(a); // Выдаст 3, так как передан аргументом в методе мейн
        System.out.println(this.a); // Выдаст 1, так как обращается к переменной экземпляра класса
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.abc(3);
    }
}