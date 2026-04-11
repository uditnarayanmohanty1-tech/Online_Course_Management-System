class Student {
    String studentName;
    String studentId;
    int progress;

    Course enrolledCourse;

    Student(String name, String id) {
        this.studentName = name;
        this.studentId = id;
        this.progress = 0;
    }

    void enroll(Course course) {
        enrolledCourse = course;
    }

    void updateProgress(int value) {
        progress = value;
    }

    void displayStudent() {
        System.out.println(studentName + " - Progress:" + progress + "%");
        
    }
}