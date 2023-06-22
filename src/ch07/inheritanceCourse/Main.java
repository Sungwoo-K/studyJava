package ch07.inheritanceCourse;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CourseManager courseManager = new CourseManager();
        Course course1 = new LectureCourse("Java",00001,"고대근" ,707, "8시");
        Course course2 = new LectureCourse("Go",00002,"고대근" ,706, "9시");
        Course course3 = new OnlineCourse("Javascript",00003,"김성우" ,"nomad");
        Course course4 = new LectureCourse("Kotlin",00004,"최준형" ,705, "8시");
        courseManager.addCourse(course1);
        courseManager.addCourse(course2);
        courseManager.addCourse(course3);
        courseManager.addCourse(course4);

        courseManager.printCourses();
        System.out.println("---------------------");
        courseManager.displayLectureCourse();
        System.out.println("---------------------");
        courseManager.displayOnlineCourse();
        System.out.println("---------------------");
        courseManager.displayCourseByInstructor("고대근");

    }
}
