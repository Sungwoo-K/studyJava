package ch06.listEx2;

public class Student {
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayStudent() {
        System.out.println("이름은 " + this.name + "입니다.");
        System.out.println("나이는 " + this.age + "입니다.");
        System.out.println("학년은 " + this.grade + "입니다.");
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }
}
