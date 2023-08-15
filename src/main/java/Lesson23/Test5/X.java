package Lesson23.Test5;

class X {
    String s1 = "privet";
}

class Y extends X {
    boolean bool = false;
}

class Test {
    public static void main(String args[]) {
        X x = new Y();
        // System.out.println(x.s1 + " " + x.bool);
        // Не удастся обратиться к булевой переменной так как она принадлежит классу У, а мы берем переменную класса Х
    }
}
