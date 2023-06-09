package ch01;

public class Strings {
    public static void main(String[] args) {
        String myName = "Sungwoo";
        System.out.println(myName);

        String firstName = new String("John");
        String lastName = "Doe";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        String message = "이렇게 \"하고\" \n싶은데";

        System.out.println(message);

        int x = 10;
        if (x > 10) {
            System.out.println("큰 수");
        } else {
            System.out.println("작은 수");
        }


        int score = 88;
        if (score >= 80) {
            System.out.println("통과");
        } else {
            System.out.println("불통과");
        }

        int num = -1;
        if (num > 0) {
            System.out.println("양수");
        } else if (num == 0) {
            System.out.println("0");
        } else {
            System.out.println("음수");
        }

        int age = 20;
        if (age > 20 ) {
            System.out.println("성인");
        } else {
            System.out.println("미성년자");
        }

        int month = 8;
        switch (month) {
            case 1 :
                System.out.println("Janyary");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7 :
                System.out.println("July");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;
            case 10 :
                System.out.println("October");
                break;
            case 11 :
                System.out.println("November");
                break;
            default :
                System.out.println("December");
        }

        int year = 2000;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("윤년");
        } else {
            System.out.println("평년");
        }

        int num1 = 8;
        int num2 = 8;
        if (num1 == num2) {
            System.out.println("같음");
        } else {
            System.out.println("다름");
        }

        /*
        8번문제 오류입니다.
        3번째 조건
        else {
            System.out.println("0");
        }
        모두 0이면 "0"이라고 했지만 결과값은 하나라도 0이면 "0"이 출력됩니다.
        그럼 하나라도 0이면 "0"으로 출력한다라고 문제를 바꾸면
        하나라도 0보다 작으면 "음수" 보다 후순위가 되어서
        int a = 1;
        int b = -1;
        int c = 0;
        가 되었을 때 "음수"가 나옵니다.
        음수가 없고 하나라도 0이 있으면 "0"을 출럭 으로 바꾸는게 좋아보입니다.
         */
        int a = 1;
        int b = -1;
        int c = 0;

        if (a > 0 && b > 0 && c > 0) {
            System.out.println("양수");
        } else if (a < 0 || b < 0 || c < 0 ) {
            System.out.println("음수");
        } else {
            System.out.println("0");
        }

        if (score > 90) {
            System.out.println("A");
        } else if (score > 80) {
            System.out.println("B");
        } else if (score > 70) {
            System.out.println("C");
        } else if (score > 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        int number = 11;

        if(number % 3 == 0 && number % 5 == 0) {
            System.out.println("3과 5의 배수");
        } else if (number % 3 == 0) {
            System.out.println("3의 배수");
        } else if (number % 5 == 0) {
            System.out.println("5의 배수");
        } else {
            System.out.println("해당사항 없음");
        }
    }
}
