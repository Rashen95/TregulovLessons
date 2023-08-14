package Lesson22;

public class Student {
    private StringBuilder name;
    private int grade;
    private int course;

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            System.out.println("Name is very short");
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        } else {
            System.out.println("Grade is not correct");
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        } else {
            System.out.println("Course is not correct");
        }
    }

    public void showInfo() {
        System.out.println("Name student: " + getName());
        System.out.println("Course: " + getCourse());
        System.out.println("Grade: " + getGrade());
    }
}
