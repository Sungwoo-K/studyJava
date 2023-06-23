package ch08.interfaceEx;

public class Bird implements Singable{
    @Override
    public void sing() {
        System.out.println("The bird is singing");
    }
}
