package studentmanagementapp;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class StudentDatabaseApp {
    private static List<Course> courses = new ArrayList<>();

    public static void main (String[] args) {
        // Ask how many new students we want to add
        System.out.println("Enter how many courses: ");
        Scanner sc = new Scanner(System.in);
        int numCourses = sc.nextInt();

        // Create numCourses of courses
        for(int i = 0; i < numCourses; i++) {
            // Create a new course and add to courses list
            Course c = new Course();
            courses.add(c);
            System.out.println(courses.get(i));
        }

        // Ask how many new students we want to add
        System.out.println("Enter how many new students to enroll: ");
        int numOfStudents = sc.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new Students
        for(int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
        }
    }

    public static List<Course> listCourses() {
        return courses;
    }
}