package ch07.inheritanceCourse;

public class LectureCourse extends Course{
    private int room;
    public  String time;

    public LectureCourse(String courseName, int courseCode, String instructor, int room, String time) {
        super(courseName, courseCode, instructor);
        this.room = room;
        this.time = time;
    }

    public int getRoom() {
        return room;
    }

    public String getTime() {
        return time;
    }
}
