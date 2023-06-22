package ch07.inheritance;

public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age); // 부모 클래스인 Person의 생성자를 호출
        this.studentId = studentId;
    }

    public void study() {
        System.out.println(super.getName() + "이(가) 공부를 시작합니다.");
    }

    // introduce 메서드를 오버라이딩(재정의)
    @Override
    public void introduce() {
        super.introduce(); // 부모 클래스의 introduce 메서드 호출
        System.out.println("제 학번은 " + studentId + "입니다.");
    }
}
