// Course.java
// Represents a course in the Online Course Management System

public class Course {

    // Private fields - Encapsulation
    private String courseName;
    private String courseId;
    private String duration;

    // Array to store enrolled students (max 10 students per course)
    private Student[] enrolledStudents;
    private int enrolledCount;

    // Constructor
    public Course(String courseName, String courseId, String duration) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.duration = duration;
        this.enrolledStudents = new Student[10];
        this.enrolledCount = 0;
    }

    // Method to add a student to this course's enrolled list
    public void addStudent(Student student) {
        if (enrolledCount < enrolledStudents.length) {
            enrolledStudents[enrolledCount] = student;
            enrolledCount++;
        } else {
            System.out.println("Course is full. Cannot enroll more students.");
        }
    }

    // Display course details along with enrolled students and their progress
    public void displayCourseDetails() {
        System.out.println("========================================");
        System.out.println("Course Name : " + courseName);
        System.out.println("Course ID   : " + courseId);
        System.out.println("Duration    : " + duration);
        System.out.println("Enrolled Students:");
        if (enrolledCount == 0) {
            System.out.println("  No students enrolled yet.");
        } else {
            for (int i = 0; i < enrolledCount; i++) {
                System.out.println("  " + (i + 1) + ". " + enrolledStudents[i].getStudentName()
                        + " - Progress: " + enrolledStudents[i].getProgress() + "%");
            }
        }
        System.out.println("========================================");
    }

    // Getters
    public String getCourseName() {
        return courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getDuration() {
        return duration;
    }

    public int getEnrolledCount() {
        return enrolledCount;
    }
}
