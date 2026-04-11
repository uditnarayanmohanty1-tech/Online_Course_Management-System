public class CourseSystem {
    public static void main(String[] args) {

        Course c1 = new Course("Java Programming", "C101", "3 Months");

        Student s1 = new Student("Rahul", "S1");
        Student s2 = new Student("Priya", "S2");

        s1.enroll(c1);
        s2.enroll(c1);

        s1.updateProgress(80);
        s2.updateProgress(65);

        c1.displayCourse();

        System.out.println("Enrolled Students:");
        s1.displayStudent();
        s2.displayStudent();
    }
}