package ch11;

public class Main2 {
    public static void main(String[] args) {
        try {
            divide(10, 1);
        } catch (ArithmeticException e) {
            System.out.println("산술 연산의 오류가 발생: " + e.getMessage());
        } finally {
            // 정상처리 상황과 예외처피 상황 모두 실행되는 코드 블록
            System.out.println("연산이 실행되었습니다.");
        }
    }

    // 메서드 throws 예외 종류
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
