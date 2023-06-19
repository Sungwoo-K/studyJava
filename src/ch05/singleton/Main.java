package ch05.singleton;

public class Main {
    public static void main(String[] args) {
        Operator s1 = Operator.getInstance();
        Operator s2 = Operator.getInstance();
        Operator s3 = Operator.getInstance();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }


}
