package com.myuniversity.courses;

import com.myuniversity.students.Student;

public class Course {
    private String name;
    private Student[] students;
    private int numStudent = 0;
    private int maxStudent = 20;

    public Course(String name, int maxStudents) {
        this.name = name;
        this.maxStudent = maxStudents;
        this.students = new Student[maxStudent];
    }

    public void joinStudent(String name) {
        Student student = new Student(name);
        if (numStudent != this.maxStudent) {
            this.students[numStudent] = student;
            numStudent++;
        } else {
            System.out.println("현재 추가하려는 과목은 만원입니다.");
        }
    }

    public String getName() {
        return name;
    }

    public int getNumStudent() {
        return numStudent;
    }

    public Student[] getStudents() {
        return students;
    }
}
