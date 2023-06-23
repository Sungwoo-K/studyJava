package ch08.interfaceEx;

public class Fish implements Swimmable{
    @Override
    public void swim() {
        System.out.println("The fish is swimming");
    }
}
