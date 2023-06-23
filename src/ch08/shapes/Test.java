package ch08.shapes;

public class Test {

    static void testArea(Shape s) {
        //1 기능: 너비 구하기 테스트
        double expectedResult = 100; // 예상된 결과
        double actualResult = s.calculateArea(); // 실제 결과

        if(expectedResult == actualResult){
            System.out.println("1. 너비 구하기 테스트 success");
        } else {
            System.out.println("1. 너비 구하기 테스트 fail");
        }
    }

    static void testPerimeter(Shape s){
        //2 기능: 둘레 구하기 테스트
        double expectedResult = 40;
        double actualResult = s.calculatePerimeter();

        if(expectedResult == actualResult){
            System.out.println("2. 둘레 구하기 테스트 success");
        } else {
            System.out.println("1. 둘레 구하기 테스트 fail");
        }

    }

    public static void main(String[] args) {
        //TDD 스타일로 개발
        Shape s = new Square(10);
        testArea(s);
        testPerimeter(s);
    }
}
