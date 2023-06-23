package ch07.inheritanceCourse;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private  List<Course> courses;

    public CourseManager() {
        this.courses = new ArrayList<>();
    }

    //다양성을 위한 LectureCourse와 OnlineCourse를 둘다 받기위해서
    //매개변수를 상위 클래스인 Course 타입으로 받는다.
    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void printCourses() {
        if (this.courses.size() != 0) {
            for (Course course : this.courses) {
                System.out.println("강의 이름 : " + course.getCourseName());
            }
        } else {
            System.out.println("강의가 없습니다.");
        }
    }

    public List<Course> getOnlineCourses(){
        List<Course> onlineCourses = new ArrayList<>();
        for (Course course: this.courses) {
            if(course instanceof OnlineCourse){
                onlineCourses.add(course);
            }
        }
        return onlineCourses;
    }

    public List<Course> getLectureCourses(){
        List<Course> lectureCourses = new ArrayList<>();
        for (Course course: this.courses) {
            if(course instanceof LectureCourse){
                lectureCourses.add(course);
            }
        }
        return lectureCourses;
    }

    public List<Course> getCourseByInstructor(String instructorName) {
        List<Course> courseByinstructor = new ArrayList<>();
        for (Course course: this.courses) {
            if(course.getInstructor().equals(instructorName)){
                courseByinstructor.add(course);
            }
        }
        return courseByinstructor;
    }

    public void displayLectureCourse() {
        List<Course> lectureCourses = getLectureCourses();

        if (lectureCourses.size() != 0) {
            for (Course course : lectureCourses){
                System.out.println("오프라인 강의 : " + course.getCourseName());
            }
        } else {
            System.out.println("오프라인 강의가 없습니다.");
        }
    }

    public void displayOnlineCourse() {
        List<Course> onlineCourse = getOnlineCourses();
        if (onlineCourse.size() != 0){
            for (Course course : onlineCourse){
                System.out.println("온라인 강의 : " + course.getCourseName());
            }
        } else {
            System.out.println("온라인 강의가 없습니다.");
        }

    }



    public void displayCourseByInstructor(String instructorName) {
        List<Course> courseByinstructor = getCourseByInstructor(instructorName);
        System.out.println(instructorName + "강사의 강의리스트");
        if (courseByinstructor.size() != 0) {
            for (Course course : courseByinstructor) {
                System.out.println("강의명 : " + course.getCourseName());
            }
        } else {
            System.out.println(instructorName + "강사의 강의가 없습니다.");
        }
    }


}
