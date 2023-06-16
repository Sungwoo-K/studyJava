package com.myuniversity.courses;

import java.util.Scanner;

public class CourseService {

    private Course[] courses;

    private int numCourse;

    private  int maxCourse;

    private Scanner scanner;

    public CourseService(int maxCourses) {
        this.maxCourse = maxCourses;
        this.courses = new Course[maxCourse];
        this.numCourse = 0;
        this.scanner = new Scanner(System.in);
    }

    //과목 생성 기능
    public void createCourse(String name, int maxStudent) {
        Course madeCourse = new Course(name, maxStudent);
        if(numCourse != this.maxCourse) {
            courses[numCourse] = madeCourse;
            System.out.println(courses[numCourse].getName());
            numCourse++;
        } else {
            System.out.println("더 이상 과목을 추가할 수 없습니다.");
        }
    }

    //과목 찾는 메소드

    public Course findCourse(String courseName) {
        for (int i = 0; i < numCourse; i++) {
            if(courses[i].getName().equals(courseName)) {
                return courses[i];
            }
        }
        return null;
    }
    //과목에 참여 학생 추가 기능
    public void addStudent(String courseName, String studentName) {
        Course course = findCourse(courseName);
        if(course != null){
            course.joinStudent(studentName);
        } else {
            System.out.println("존재하지 않는 과목입니다.");
        }

    }

    //과목에 참여한 최대 학생 수
    public void numStudentInCourse(String courseName) {
        Course course = findCourse(courseName);
        int numStudent = course.getNumStudent();
        System.out.println(numStudent + "명 입니다.");
    }

    public void run() {
        while (true) {
            System.out.println("1: 과목 생성");
            System.out.println("2: 과목에 참여 학생 추가");
            System.out.println("3: 과목에 참여한 최대 학생 수 확인");
            System.out.println("0: 종료");
            System.out.print("원하시는 메뉴번호를 입력해주세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if(choice == 0) {
                System.out.println("시스템이 종료되었습니다.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("과목이름을 입력해주세요: ");
                    String name = scanner.nextLine();
                    System.out.print("최대 학생 수를 입력해주세요: ");
                    int maxStudent = scanner.nextInt();
                    scanner.nextLine();
                    createCourse(name, maxStudent);
                    break;
                case 2:
                    System.out.print("추가할 과목의 이름을 입력해주세요: ");
                    String courseName1 = scanner.nextLine();
                    System.out.print("추가할 학생의 이름을 입력해주세요: ");
                    String studentName = scanner.nextLine();
                    addStudent(courseName1, studentName);
                    break;
                case 3:
                    System.out.print("학생수를 확인할 과목을 입력해주세요: ");
                    String courseName2 = scanner.nextLine();
                    numStudentInCourse(courseName2);
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    break;
            }

        }
    }

}
