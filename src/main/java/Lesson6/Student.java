package Lesson6;

public class Student {
    int studentIDNumber;
    String firstName;
    String lastName;
    short yearOfStudy;
    float avrgScoreEconomics;
    float avrgScoreMath;
    float avrgScoreForeignLanguage;

    public Student(int studentIDNumber, String firstName, String lastName, short yearOfStudy, float avrgScoreEconomics, float avrgScoreMath, float avrgScoreForeignLanguage) {
        this.studentIDNumber = studentIDNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfStudy = yearOfStudy;
        this.avrgScoreEconomics = avrgScoreEconomics;
        this.avrgScoreMath = avrgScoreMath;
        this.avrgScoreForeignLanguage = avrgScoreForeignLanguage;
    }

    Student(int studentIDNumber, String firstName, String lastName, short yearOfStudy) {
        this(studentIDNumber, firstName, lastName, yearOfStudy, 0.0f, 0.0f, 0.0f);
    }

    Student() {
        this(0, null, null, (short) 0, 0.0f, 0.0f, 0.0f);
    }
}
