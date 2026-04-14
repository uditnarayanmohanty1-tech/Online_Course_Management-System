// Student.java
// Represents a student in the Online Course Management System

public class Student {

    // Private fields - Encapsulation
    private String studentName;
    private String studentId;
    private int progress;

    // Array to store enrolled courses (max 5 courses per student)
    private Course[] enrolledCourses;
    private int courseCount;

    // Constructor
    public Student(String studentName, String studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.progress = 0;
        this.enrolledCourses = new Course[5];
        this.courseCount = 0;
    }

    // Method to enroll student in a course
    public void enroll(Course course) {
        if (courseCount < enrolledCourses.length) {
            enrolledCourses[courseCount] = course;
            courseCount++;
            course.addStudent(this); // Also register student inside course
            System.out.println(studentName + " has been successfully enrolled in: " + course.getCourseName());
        } else {
            System.out.println(studentName + " cannot enroll in more than 5 courses.");
        }
    }

    // Method to update progress
    public void updateProgress(int value) {
        if (value >= 0 && value <= 100) {
            this.progress = value;
            System.out.println("Progress updated for " + studentName + ": " + progress + "%");
        } else {
            System.out.println("Invalid progress value. Please enter a value between 0 and 100.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("----------------------------------------");
        System.out.println("Student Name : " + studentName);
        System.out.println("Student ID   : " + studentId);
        System.out.println("Progress     : " + progress + "%");
        System.out.println("Enrolled Courses:");
        if (courseCount == 0) {
            System.out.println("  Not enrolled in any course yet.");
        } else {
            for (int i = 0; i < courseCount; i++) {
                System.out.println("  " + (i + 1) + ". " + enrolledCourses[i].getCourseName()
                        + " (ID: " + enrolledCourses[i].getCourseId() + ")");
            }
        }
        System.out.println("----------------------------------------");
    }

    // Getters
    public String getStudentName() {
        return studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getProgress() {
        return progress;
    }
}
