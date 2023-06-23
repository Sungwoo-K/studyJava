package ch08.interfaceEx;

public class Rabbit implements Runnable {
    @Override
    public void run() {
        System.out.println("The rabbit is running fast!");
    }
}
