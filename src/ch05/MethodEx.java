package ch05;

public class MethodEx {
    public static void main(String[] args) {
        Utils utils = new Utils();

        int a = 5;
        int b = 4;

        int cul = utils.sum(a,b);

        int findMax = utils.findMax(3, 5);

        int[] numbers = {1, 2, 3, 4};
        int addAllNum = utils.addNum(numbers);

        String[] strings = {"hi", "asdflkm", "asldkfmalskdfmlkadsf"};
        String longestString = utils.longestString(strings);

        int[] numbers1 = {1,2,3,4,5,6,7,8,9,10} ;
        int evenNumber = utils.evenNum(numbers1);

        int result = utils.factorial(5);
        System.out.println(result);

        String strResult = utils.concatenate("hi","hello");
        System.out.println(strResult);

        double douResult = utils.calculateAverage(3.5,4.4);
        System.out.println(douResult);
    }
}
