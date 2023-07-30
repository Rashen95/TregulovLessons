package Lesson6;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(2, "Artem", "Privalov", (short) 15);
        Student s3 = new Student(3, "Anastasia", "Alekseeva", (short) 2,
                5.5f, 6.5f, 3.8f);
        s1.studentIDNumber = 1;
        s1.firstName = "Alex";
        s1.lastName = "Fedorov";
        s1.yearOfStudy = 2;
        s1.avrgScoreEconomics = 4.5f;
        s1.avrgScoreMath = 3.8f;
        s1.avrgScoreForeignLanguage = 4.9f;
        StudentTest st = new StudentTest();
        st.info(s1);
        st.info(s2);
        st.info(s3);
    }

    void info(Student s) {
        System.out.println("Средний балл за все предметы у студента с фамилией " + s.lastName + " равен " +
                (s.avrgScoreEconomics + s.avrgScoreMath + s.avrgScoreForeignLanguage) / 3);
    }
}
