package ch01;

public class DataTypes {

    public static void main(String[] args) {
        // 1.정수형 자료형
        int aaa;
        aaa = 0;

        int age = 20;   // 4바이트를 저장할 수 있음 (-21역 ~ 21억)
        long myLong = 1234L; // 8바이트를 저장할 수 있음

        // 잘 안씀
        byte myByte = 10;   // 1바이트의 정수값 저장
        short no = 10;  // short -3만2천 ~ 3만2천

        // 1 바이트(bytes) = 8bit (이진수 01001011 = 십진수 147)
        // 1 bit (0 or 1)

        // 2. 실수형 자료형(소숫점이 있는 숫자, 10.0; 실수; 10; 정수)
        // 실수 : Flooting-Point
        float myFloat = 3.14f;  // 4바이트
        // ★거의 이것만 쓴다.
        double myDouble = 3.14159;

        // 3. 문자형 자료형(Character) : 2바이트 공간크기
        // 실제로는 글자를 저장하는게 아니라 숫자로 변환해서 저장함
        // 아스키(ASCII)코드 개념, 유니코드(Unicode) : 영어 이외의 언어 지원
        // 글자 1개 저장 가능, A, o, 1, #
        // java에서는 거의 안쓴다
        char myChar = 'A';

        // 4. 논리형 자료형(Boolean Type)
        // 참 또는 거짓(True/False) 값을 저장가능한 자료형
        // 변수명으로 is변수명 을 많이 씀
        boolean isTrue = true;
        boolean isKorean = false;

        // 변수명 = 값, 값을 변수 공간에 저장한다. 대입한다. 할당한다.

        /*
        6/8 정리...
        <용어>
        main : main 메소드는 Java 프로그램이 실행될 때 자동으로 호출되며,
               프로그램의 실행 흐름을 시작하는 역할을 함.
        JVM : 자바 가상 머신 (자바 class를 실행하는 프로그램)
        변수(Variable) : 값을 저장하는 메모리 공간의 이름
        선언(declare) :
        할당(assingment) : 변수에 값을 할당하여 사용
        변수명 짓기
        자료형의 종류, 비트, 바이트, 아스키코드, 유니코드
        기본형 : int, long, byte, short, float, double, char, boolean
       */

    }
}
