package ch05.overloading;

public class Main {
    public static void main(String[] args) {
        Operator op = new Operator();
        int resultInt = op.multiply(4,5);
        double resultDouble = op.multiply(4.0,5.0);
        System.out.println(resultInt);
        System.out.println(resultDouble);
    }
}
