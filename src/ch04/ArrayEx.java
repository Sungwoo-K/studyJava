package ch04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[2] = 7;
        System.out.println(numbers[2]);

        String[] str = new String[3];
        str[0] = "Java";
        str[1] = "Python";
        str[2] = "C++";
        for(String string: str){
            System.out.println(string);
        }

        Scanner scanner = new Scanner(System.in);

        double[] dou = new double[4];

        System.out.println("숫자를 입력해주세요.");
        for (int i = 0; i < dou.length; i++) {
            dou[i] = scanner.nextInt();
            System.out.println(dou[i]);
        }

        int[] num = new int[7];
        for (int i = 0; i < num.length; i++){
            num[i] = i + 1;
            System.out.println(num[i]);
        }

        //5번문제 오류

        int[] num1 = new int[5];
        for(int number: num1){
            System.out.println(number);
        }


        int[] numb = new int[4];
        int result1 = 0;
        System.out.println("숫자를 입력해주세요.");
        for(int sum: numb){
            sum = scanner.nextInt();
            result1 += sum;
        }
        System.out.println(result1);

        int[] numb1 = new int[5];

        System.out.println("숫자를 입력해주세요.");
        for(int i = 0; i < numb1.length; i++){
            numb1[i] = scanner.nextInt();
        }
        int high = numb1[0];
        int low = numb1[0];
        for (int i = 0; i < numb1.length; i++) {
            if (numb1[i] > high) {
                high = numb1[i];
            }
        }
        for (int i = 0; i < numb1.length; i++) {
            if (numb1[i] < low) {
                low = numb1[i];
            }
        }
        System.out.println("가장높은 수 : " + high);
        System.out.println("가장낮은 수 : " + low);

        String[] string = new String[5];
        System.out.println("이름을 입력해주세요.");
        for (int i = 0; i < string.length; i++) {
            string[i] = scanner.next();
        }
        Arrays.sort(string);
        for(String name: string){
            System.out.println(name);
        }

        int[] numb2 = new int[6];
        int result2 = 0;
        System.out.println("숫자를 입력해주세요.");
        for (int i = 0; i < numb2.length; i++) {
            numb2[i] = scanner.nextInt();
            if (numb2[i] % 2 == 1 ){
                result2 += 1;
            }
        }
        System.out.println("홀수는 " + result2 + "개 입니다.");
        //////////////////////////////////////////

        char[][] numArray = new char[4][4];
        char al = 'A';
        for(int i = 0; i < numArray.length; i++){
            for(int j = 0; j < numArray[i].length; j++){
                numArray[i][j] = al++;
                System.out.print(numArray[i][j]);
            }
            System.out.println();
        }

        char[][] alpa = new char[4][4];
        char ch = 'A';
        for (int i = 0; i < alpa.length; i++) {
            for (int j = 0; j < alpa[i].length; j++) {
                alpa[i][j] = ch++;
            }
        }

        for (int i = 0; i < alpa.length; i++) {
            for (int j = 0; j < alpa[i].length; j++) {
                if(i == j) {
                    System.out.println(alpa[i][j]);
                }
            }
        }



        int[][] numbers1 = new int[2][2];
        int[][] numbers2 = new int[2][2];
        int[][] result = new int [2][2];
        int globalNumber = 1;
        for(int i = 0; i < numbers1.length; i++){
            for(int j = 0; j < numbers1[i].length; j++){
                numbers1[i][j] = globalNumber++;
                System.out.print(numbers1[i][j]);
            }
            System.out.println();
        }

        for(int i = 0; i < numbers2.length; i++){
            for(int j = 0; j < numbers2[i].length; j++){
                numbers2[i][j] = globalNumber++;
                System.out.print(numbers2[i][j]);
            }
            System.out.println();
        }

        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[i].length; j++){
                result[i][j] = numbers1[i][j] + numbers2[i][j];
                System.out.print(result[i][j]);
            }
            System.out.println();
        }


        ///////////////////////////////////////////

        int[] number = {1, 2, 3, 4, 5};
        int sum = 0;

        for(int nums : number) {
            sum += nums;
        }

        System.out.println("배열의 합: " + sum);



        int[] number1 = {7, 14, 3, 8, 21, 5};
        int max = number1[0];

        for(int nums: number1){
            if (max < nums) {
                max = nums;
            }
        }

        System.out.println("최댓값: " + max);
    }
}
