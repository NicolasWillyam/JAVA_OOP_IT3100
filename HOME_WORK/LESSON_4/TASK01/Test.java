package JAVA_OOP_IT3100.HOME_WORK.LESSON_4.TASK01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("Enter number of student: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            System.out.println("Enter information for student number" + (i + 1) + ":");
            System.out.print("Studen Name: ");
            String name = scanner.nextLine();
            System.out.print("Student Age: ");
            int year = scanner.nextInt();
            students[i] = new Student(name, year);
        }

        System.out.println("\nStudents List:");
        for (int i = 0; i < n; i++) {
            System.out.print(students[i].getStudentName() + " ");
            System.out.println(2024 - students[i].getStudentYear() + " ");
        }
    }
}
