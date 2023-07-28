package Lesson5;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.studentIDNumber = 1;
        s1.firstName = "Alex";
        s1.lastName = "Fedorov";
        s1.yearOfStudy = 2;
        s1.avrgScoreEconomics = 4.5f;
        s1.avrgScoreMath = 3.8f;
        s1.avrgScoreForeignLanguage = 4.9f;
        s2.studentIDNumber = 2;
        s2.firstName = "Artem";
        s2.lastName = "Privalov";
        s2.yearOfStudy = 3;
        s2.avrgScoreEconomics = 5f;
        s2.avrgScoreMath = 5f;
        s2.avrgScoreForeignLanguage = 4.9f;
        s3.studentIDNumber = 3;
        s3.firstName = "Artem";
        s3.lastName = "Gavrilov";
        s3.yearOfStudy = 1;
        s3.avrgScoreEconomics = 5f;
        s3.avrgScoreMath = 5f;
        s3.avrgScoreForeignLanguage = 4.9f;
        StudentTest s = new StudentTest();
        s.info(s1);
        s.info(s2);
        s.info(s3);
    }

    void info(Student s) {
        System.out.println("Средний балл за все предметы у студента с фамилией " + s.lastName + " равен " +
                (s.avrgScoreEconomics + s.avrgScoreMath + s.avrgScoreForeignLanguage) / 3);
    }
}
