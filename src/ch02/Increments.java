package ch02;

public class Increments {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = ++a * b--;
        System.out.println(c);
        System.out.println(b);


    }
}
