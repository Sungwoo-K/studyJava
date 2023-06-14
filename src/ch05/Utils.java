package ch05;

public class Utils {
    public int sum(int x, int y) {
        int res = x+y;
        System.out.println("결과는 " + res + "입니다.");
        return res;
    }

    public int findMax(int x, int y ) {
        int max = x > y ? x : y;
        System.out.println("결과는 " + max + "입니다.");
        return max;
    }


    public int addNum(int[] arr){
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        System.out.println("결과는 " + sum + "입니다.");
        return sum;
    }

    public String longestString(String[] arr){
        String string = "";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() > string.length()){
                string = arr[i];
            }
        }
        System.out.println("결과는 " + string + "입니다.");
        return string;
    }

    public int evenNum(int[] arr) {
        int even = 0;
        for(int num: arr){
            if(num % 2 == 0) {
                even++;
            }
        }
        System.out.println("결과는 " + even + "입니다.");
        return even;
    }

    public int getLenght(String str) {
        int stringLength = str.length();
        return stringLength;
    }

    public int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }

    public String concatenate(String str1, String str2) {
        String result = str1 + str2;
        return result;
    }

    public double calculateAverage(double dou1, double dou2) {
        double result = (dou1 + dou2) / 2;
        return result;
    }
}
