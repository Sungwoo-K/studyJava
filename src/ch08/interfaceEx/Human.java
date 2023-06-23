package ch08.interfaceEx;

public class Human implements Runnable, Walkable{
    @Override
    public void run() {
        System.out.println("The human is running");
    }

    @Override
    public void walk() {
        System.out.println("The human is walking");
    }
}
