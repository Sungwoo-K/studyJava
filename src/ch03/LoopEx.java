package ch03;

public class LoopEx {
    public static void main(String[] args) {
        //반복문 연습
        for(int i = 1;i <= 10; i++){
            System.out.print(i);
        }

        System.out.println();
        for(int j = 1;j <= 100;j++){
            if(((j * 3) % 2) == 1){
                System.out.println(j);
            }
        }
        for(int k = 1; k <= 9;k++){
            System.out.println(k * 5);
        }

        for (int l = 10; l > 0 ; l--){
            System.out.println(l);
        }

        int m = 0;
        for(int n = 1;n <= 100; n++){
            if(n % 3 == 0) {
                m += n;
            }
        }
        System.out.println(m);

        for (int o = 1; o <= 100; o++){
            if(o % 3 == 0 || o % 5 == 0) {
                System.out.println(o);
            }
        }

        for(int p = 9; p > 0; p--) {
            System.out.println(p * 7);
        }

        for(int q = 1; q < 6; q++){
            for(int s = 0;s < 5 - q; s++){
                System.out.print(" ");
            }
            for(int r = 0;r < q;r++){
                System.out.print("*");
            }
            System.out.println();
        }

        ///////////////////////////////////

        //교제 풀이

        int sum = 0;

        for(int i = 1; i <= 100; i++){
            if(i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("5의 배수의 합계는 " + sum);

        int evenSum = 0;
        int oddSum = 0;

        for (int i=1; i <=100; i++) {
            if(i % 2 == 0){
                evenSum += i;
            }
            if(i % 2 == 1){
                oddSum += i;
            }
        }
        System.out.println("짝수의 합계는 " + evenSum);
        System.out.println("홀수의 합계는 " + oddSum);

        for(int x = 1; x <= 6; x++){
            for(int y = 1; y <= 6; y++){
                if(x + y == 6){
                    System.out.print(x + ", " + y);
                }
            }
            System.out.println();
        }

        for(int i = 1; i < 6; i++){
            for (int j = 0;j < i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 1; i < 6; i++){
            for (int j = 0;j < 6 - i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 1; i < 6; i++){
            for (int k = 0;k < 5 - i ; k++){
                System.out.print(" ");
            }
            for (int j = 0;j < i * 2 - 1 ; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
