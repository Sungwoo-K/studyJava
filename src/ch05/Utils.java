package ch05;

public class Utils {
    public static int sum(int x, int y) {
        return x + y;
    }

    public static int findMax(int x, int y ) {
        int max;
        if(x > y) {
            max = x;
        } else {
            max = y;
        }

        return max;
    }

    public static int addNum(int[] x){
        int sum = 0;
        for(int num : x){
            sum += num;
        }
        return sum;
    }

    public static String longestString(String[] x){
        String string = "";
        for (int i = 0; i < x.length; i++) {
            if(x[i].length() > string.length()){
                string = x[i];
            }
        }
        return string;
    }

    public static int evenNum(int[] x) {
        int even = 0;
        for(int num: x){
            if(num % 2 == 0) {
                even++;
            }
        }
        return even;
    }
}
