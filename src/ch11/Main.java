package ch11;

public class Main {
    public static void main(String[] args) {
        try {
            // 입력값 예제, 0이되는 케이스는 주로 입력값을 제대로 못받은 경우
            int term = 0;
            int amount = 240;
            int result = amount / term;
            System.out.println("한달에 " + result + "만원");
        } catch (ArithmeticException e) { //특정 예외 상황
            System.out.println("산술연산 예외 발생: " + e.getMessage());
            System.out.println("나누기 연산의 값을 정확히 입력해주세요.");
        } catch (Exception e) { //일반적인 예외 상황
            System.out.println(e.getMessage());
        }

    }
}
