package Lesson23.Test1.p2;

import Lesson23.Test1.p1.*;

public class Y extends X {
    // Y() {  Данный конструктор не будет запущен, так как должен ссылаться на конструктор супер класса, а у Х конструктор
    // }  имеет дефолтный модификатор доступа и он не будет виден, так как класс У находится в другом пакете

    public void abc() {
        System.out.println("Y");
    }

    public static void main(String[] args) {
        Y y = new Y();
        y.abc();
    }
}
