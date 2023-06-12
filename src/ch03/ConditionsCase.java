package ch03;

public class ConditionsCase {
    public static void main(String[] args) {
        // switch 문
        int dayOfWeek = 3;
        switch (dayOfWeek){
            case 1 :
                System.out.println("월요일");
                break;
            case 2 :
                System.out.println("화요일");
                break;
            case 3 :
                System.out.println("수요일");
                break;
            case 4 :
                System.out.println("목요일");
                break;
            case 5 :
                System.out.println("금요일");
                break;
            case 6 :
                System.out.println("토요일");
                break;
            case 7 :
                System.out.println("일요일");
                break;
            default:
                System.out.println("무슨 요일인지 모르겠습니다.");
        }
    }
}
