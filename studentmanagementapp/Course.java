package studentmanagementapp;

import java.util.Scanner;

public class Course {
    private int courseId;
    private String courseDescription;
    private String instructor;

    public Course() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter course description : ");
        this.courseDescription = sc.nextLine();
        System.out.println("Enter course instructor : ");
        this.instructor = sc.nextLine();
        System.out.println("Enter courseId: ");
        this.courseId = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Course id is : " + courseId + "\nCourse description is: " + courseDescription + "\nInstructor is: " + instructor;
    }
}
