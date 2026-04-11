class Course {
    String courseName;
    String courseId;
    String duration;

    Course(String name, String id, String duration) {
        this.courseName = name;
        this.courseId = id;
        this.duration = duration;
    }

    void displayCourse() {
        System.out.println("Course: " + courseName);
        System.out.println("Course ID: " + courseId);
        System.out.println("Duration: " + duration);
    }
}