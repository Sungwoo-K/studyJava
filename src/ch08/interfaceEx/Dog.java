package ch08.interfaceEx;

public class Dog implements Playble{
    @Override
    public void play() {
        System.out.println("The dog is playing with the ball");
    }
}
