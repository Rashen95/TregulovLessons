package Lesson4;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.studentIDNumber = 1;
        s1.firstName = "Alex";
        s1.lastName = "Fedorov";
        s1.avrgScoreEconomics = 4.5f;
        s1.avrgScoreMath = 3.8f;
        s1.avrgScoreForeignLanguage = 4.9f;
        s2.studentIDNumber = 2;
        s2.firstName = "Artem";
        s2.lastName = "Privalov";
        s2.avrgScoreEconomics = 5f;
        s2.avrgScoreMath = 5f;
        s2.avrgScoreForeignLanguage = 4.9f;
        s3.studentIDNumber = 3;
        s3.firstName = "Artem";
        s3.lastName = "Gavrilov";
        s3.avrgScoreEconomics = 5f;
        s3.avrgScoreMath = 5f;
        s3.avrgScoreForeignLanguage = 4.9f;
        System.out.println("Средний балл за все предметы у студента с фамилией " + s1.lastName + " равен " +
                (s1.avrgScoreEconomics+s1.avrgScoreMath+s1.avrgScoreForeignLanguage)/3);
        System.out.println("Средний балл за все предметы у студента с фамилией " + s2.lastName + " равен " +
                (s2.avrgScoreEconomics+s2.avrgScoreMath+s2.avrgScoreForeignLanguage)/3);
        System.out.println("Средний балл за все предметы у студента с фамилией " + s3.lastName + " равен " +
                (s3.avrgScoreEconomics+s3.avrgScoreMath+s3.avrgScoreForeignLanguage)/3);
    }
}
