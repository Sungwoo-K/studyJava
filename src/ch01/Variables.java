package ch01;

public class Variables {

    public static void main(String[] args) {

        // 정수형 자료형(Integer Types) : byte, short, int, long
        // int: 4개의 기본 값을 저장합니다. 범위는 -2,147,483,648부터 2,147,483,647까지입니다. (대략 +- 20억)
        int age;

        // assignment : 값 할당
        age = 20;
        System.out.println(age);
        
        /*
         변수 정의 시 주의사항 :
         숫자로 시작하면 안됨, 일반적으로 소문자로 시작, 두번째 단어부터는 대문자로 시작
         example)
         byte myByte = 10;
         int studentAge = "";
         변수이름 표기법 : camel-case(카멜케이스) 표기법
        */

    }
}
