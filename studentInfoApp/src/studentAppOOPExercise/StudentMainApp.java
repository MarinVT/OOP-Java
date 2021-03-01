package studentAppOOPExercise;

import java.util.Scanner;

public class StudentMainApp {
    public static void main(String[] args) {

        //How many new students we want to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();

        //Create array of objects
        Student[] students = new Student[numberOfStudents];

        //Create n number of new students
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        for (int n = 0; n < numberOfStudents; n++) {
            System.out.println(students[n].toString());
        }
    }
}
