package ch07.inheritanceCourse;

public class OnlineCourse extends Course {
    private String platform;

    public OnlineCourse(String courseName, int courseCode, String instructor, String platform) {
        super(courseName, courseCode, instructor);
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }
}
