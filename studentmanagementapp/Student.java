package studentmanagementapp;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private List<Integer> courseIds = new ArrayList<>();
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter students first name : ");
        this.firstName = sc.nextLine();
        System.out.println("Enter students last name : ");
        this.lastName = sc.nextLine();
        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - junior\n4 - Senior\n Enter students grade level : ");
        this.gradeYear = sc.nextInt();
        setStudentID();
    }

    //Generate an id
    private void setStudentID() {
        //Grade Level + ID
        id++;
        this.studentID = gradeYear + "" + id;
        System.out.println("--------------" + studentID + " setup complete" + "-----------------");
    }

    // View Courses
    private List<Course> viewCourses() {
        return StudentDatabaseApp.listCourses();
    }

    // Enroll in courses
    public void enroll() {
        List<Course> allCourses = viewCourses();
        for(Course c : allCourses) {
            System.out.println(c);
        }

        // Get inside a loop, user hits 0
        while(true) {
            System.out.print("Enter courseId (0 to quit): ");
            Scanner sc = new Scanner(System.in);
            int courseId = sc.nextInt();
            if (courseId == 0) {
                break;
            } else {
                courseIds.add(courseId);
                tuitionBalance = tuitionBalance + costOfCourse;
             }
        }
        System.out.println("--------------" + studentID + " enrollment complete" + "-----------------");
    }

    // View Balance
    private void viewBalance() {
        System.out.println("your balance is : $" + tuitionBalance);
    }

    // Pay Tuition
    public void payTuition() {
        viewBalance();
        System.out.println("Enter your Payment: $");
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for the payment of $" + payment);
        viewBalance();
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +"\nGrade Level: " + gradeYear + "\nStudentID: " + studentID + "\nCourses Enrolled:" + courseIds + "\nBalance: $"+ tuitionBalance;
    }
}