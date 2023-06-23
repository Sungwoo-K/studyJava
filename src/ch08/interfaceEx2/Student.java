package ch08.interfaceEx2;

public class Student implements Gradable, Studyable {

    private int grade;

    public Student(int grade) {
        this.grade = grade;
    }

    @Override
    public void calculateGrade() {
        if(this.grade > 90) {
            System.out.println("당신의 성적은 A 입니다.");
        } else if (this.grade > 80){
            System.out.println("당신의 성적은 B 입니다.");
        } else if (this.grade > 70) {
            System.out.println("당신의 성적은 C 입니다.");
        } else if (this.grade > 60) {
            System.out.println("당신의 성적은 D 입니다.");
        } else {
            System.out.println("당신의 성적은 F 입니다.");
        }
    }

    @Override
    public void study() {
        System.out.println("학생이 공부중입니다.");
    }
}
