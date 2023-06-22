package ch07.inheritanceCourse;

public class Course {
    private String courseName;
    private int courseCode;

    //강사이름
    private String instructor;

    public Course(String courseName, int courseCode, String instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public String getInstructor() {
        return instructor;
    }
}
