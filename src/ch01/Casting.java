package ch01;

public class Casting {
    public static void main(String[] args) {

        //웬만하면 잘 안 쓰는게 좋다.
        // 형변형하다가 나중에 까먹고 side-effect가 생길 수 있다.
        int x = 10;
        double y = x;
        System.out.println(y);

        double a = 10.0;
        int b = (int) a;
        System.out.println(b);

        int number = 10;
        String str = Integer.toString(number);
        System.out.println(str);
        String strValue = String.valueOf(number);
        System.out.println(strValue);

        double decimal = 10.5;
        String strDecimal = Double.toString(decimal);
        System.out.println(strDecimal);
        String strDecimalValue = String.valueOf(decimal);
        System.out.println(strDecimalValue);

        // 숫자 => 문자열
        // String.valueOf(아무데이터타입값);

        String numStr = "10";
        int num1 = Integer.valueOf(numStr);
        int num2 = Integer.parseInt(numStr);
        System.out.println(num1);
        System.out.println(num2);
        double num3 = Double.valueOf(numStr);

    }
}
