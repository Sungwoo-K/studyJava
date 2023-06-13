package ch05;

public class Student {
    //문제 1: 학생의 이름(name)과 학년(grade)를 필드로 가지는 Student 클래스를 작성하십시오.
    private String studentName;
    private int studentGrade;
    private int studentAge;

    public Student(String name, int grade, int age) {
        this.studentName = name;
        this.studentGrade = grade;
        this.studentAge = age;
    }

    public Student(){

    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public void setStudentGrade(int grade) {
        this.studentGrade = grade;
    }

    public void setStudentAge(int age) {
        this.studentAge = age;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public int getStudentGrade() {
        return this.studentGrade;
    }

    public int getStudentAge() {
        return this.studentAge;
    }

    public void printStudentInfo() {
        System.out.println("학생의 이름은: " + studentName);
        System.out.println("학생의 학년은: " + studentGrade);
        System.out.println("학생의 나이는: " + studentAge);
    }

    public void promoteGrade() {
        this.studentGrade++;
    }

}
