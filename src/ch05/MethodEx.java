package ch05;

public class MethodEx {
    public static void main(String[] args) {
        int cul = Utils.sum(3,4);
        System.out.println(cul);

        int findMax = Utils.findMax(3, 5);
        System.out.println(findMax);

        int[] numbers = {1, 2, 3, 4};
        int addAllNum = Utils.addNum(numbers);
        System.out.println(addAllNum);

        String[] strings = {"hi", "asdflkm", "asldkfmalskdfmlkadsf"};
        String longestString = Utils.longestString(strings);
        System.out.println(longestString);

        int[] numbers1 = {1,2,3,4,5,6,7,8,9,10} ;
        int evenNumber = Utils.evenNum(numbers1);
        System.out.println(evenNumber);
    }
}
