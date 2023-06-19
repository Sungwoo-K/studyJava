package ch06.inheritance;

public class Child extends Parent{
    int number = 2;

    public Child() {
        System.out.println("자식 객체 생성");
    }

    public void  print(){
        int number = 1;
        System.out.println(number);
        System.out.println(this.number);
        System.out.println(super.number);
    }
}
