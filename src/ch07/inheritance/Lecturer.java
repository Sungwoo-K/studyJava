package ch07.inheritance;

public class Lecturer extends Person{
    private int career;
    public Lecturer(String name, int age, int career) {
        super(name, age);
        this.career = career;
    }

    public void introduce() {
        System.out.println("안녕하세요. 제 이름은 " + getName() + "이고, 경력은 " + career + "년 입니다.");
    }
    public void teach() {
        System.out.println("학생을 가르칩니다.");
    }
}
