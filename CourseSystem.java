// CourseSystem.java
// Main class to test the Online Course Management System

public class CourseSystem {

    public static void main(String[] args) {

        // ---- Creating Course Objects ----
        Course c1 = new Course("Java Programming", "C101", "3 Months");
        Course c2 = new Course("Data Structures", "C102", "2 Months");
        Course c3 = new Course("Web Development", "C103", "4 Months");

        // ---- Creating Student Objects ----
        Student s1 = new Student("Rahul", "S001");
        Student s2 = new Student("Priya", "S002");
        Student s3 = new Student("Amit", "S003");

        System.out.println("\n===== ENROLLING STUDENTS IN COURSES =====\n");

        // ---- Enrolling Students ----
        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);
        s2.enroll(c3);
        s3.enroll(c2);
        s3.enroll(c3);

        System.out.println("\n===== UPDATING STUDENT PROGRESS =====\n");

        // ---- Updating Progress ----
        s1.updateProgress(80);
        s2.updateProgress(65);
        s3.updateProgress(50);

        System.out.println("\n===== COURSE DETAILS =====\n");

        // ---- Displaying Course Details ----
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();

        System.out.println("\n===== STUDENT DETAILS =====\n");

        // ---- Displaying Student Details ----
        s1.displayStudentDetails();
        s2.displayStudentDetails();
        s3.displayStudentDetails();
    }
}
