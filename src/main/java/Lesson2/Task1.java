package Lesson2;

public class Task1 {
    public static void main(String[] args) {
        byte b1 = 12; // Десятичное представление
        byte b2 = 0b1100; // Двоичное представление
        byte b3 = 0_14; // Восьмеричное представление
        byte b4 = 0xC; // Шестнадцатиричное представление
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        System.out.println();

        short s1 = -1300;
        short s2 = -0b10100010100;
        short s3 = -0_2424;
        short s4 = -0x514;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println();

        int i1 = 0;
        int i2 = 0b0;
        int i3 = 0_0;
        int i4 = 0x0;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        System.out.println();

        long l1 = 123456789;
        long l2 = 0b111010110111100110100010101;
        long l3 = 0_726746425;
        long l4 = 0x75BCD15;
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
    }
}
