
package JAVA_OOP_IT3100.HOME_WORK.LESSON_4.TASK01;

public class Student {
    private String name;
    private int year;

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getStudentName() {
        return name;
    }

    public void setStudentName(String newName) {
        this.name = newName;
    }

    public int getStudentYear() {
        return year;
    }

    public void setStudentYear(int newYear) {
        this.year = newYear;
    }
}
