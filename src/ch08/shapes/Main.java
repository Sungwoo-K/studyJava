package ch08.shapes;

public class Main {
    public static void main(String[] args) {
        // 인터페이스 객체 생성이 불가하다
        // Shape s = new Shape(5); <- 생성불가
        // 구현체로만 객체 생성이 가능하다.
        // Shape s = new Circle(5);
        // 회사 경영진이 원에서 사격형으로 바꾸라고 지시함
        Shape s = new Circle(10);
        // 인터페이스를 쓰는 이유 1번째가 갈아끼기 쉽다.
        System.out.println(s.calculateArea());
        System.out.println(s.calculatePerimeter());
        // 인터페이스 사용 이유
        // 1. 구현 클래스들의 기본 스펙(기능)을 정의


    }
}
