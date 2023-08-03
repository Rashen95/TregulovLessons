package Lesson12;

public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Artem", 3, 5.5);
        Student st2 = new Student("Artem", 3, 5);
        method1(st1, st2);
        method2(st1, st2);
    }

    public static void method1(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Students equals");
        } else {
            System.out.println("Student not equals");
        }
    }

    public static void method2(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Students are completely equal");
                } else {
                    System.out.println("Student`s name and course equals but grade not equals");
                }
            } else {
                System.out.println("Student`s name equals but course not equals");
            }
        } else {
            System.out.println("Student`s name not equals");
        }
    }
}
