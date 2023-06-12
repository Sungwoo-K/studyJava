package ch03;

public class ConditionalEx {
    public static void main(String[] args) {
        // 조건문 연습
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

        int num0 = 11;

        if(num0 % 3 == 0 && num0 % 5 == 0) {
            System.out.println("3과 5의 배수");
        } else if (num0 % 3 == 0) {
            System.out.println("3의 배수");
        } else if (num0 % 5 == 0) {
            System.out.println("5의 배수");
        } else {
            System.out.println("해당사항 없음");
        }
    }
}
