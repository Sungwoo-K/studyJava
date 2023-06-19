package ch05.statics;

public class Main {
    public static void main(String[] args) {
        Counter count = new Counter();
        System.out.println(count.getCount());

        Counter c = new Counter();
        System.out.println(c.getCount());
    }
}
