package studentAppOOPExercise;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;


    //Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student firstName: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter student lastName: ");
        this.lastName = scanner.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = scanner.nextInt();

        setStudentID();
    }

    //Generate an ID
    private void setStudentID() {
        //Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    //Enroll in courses
    public void enroll() {
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!course.equalsIgnoreCase("q")) {
                courses = courses + "\n -> " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
    }
    //View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    //Pay Tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner scanner = new Scanner(System.in);
        int payment = scanner.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for payment of $" + payment);
        viewBalance();
    }

    //Show status
    public String toString() {
        return "Name: " + firstName + " " + lastName
                + "\nGrade Level: "+ gradeYear
                + "\nStudent ID: " + studentID
                + "\nCourses Enrolled: " + courses
                + "\nBalance is: $" + tuitionBalance;
    }

}
