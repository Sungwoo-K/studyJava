package ch10.annotation;

public class MyClass implements MyAnnotation {

    public void myMethod(){
    }

    @Override
    public void test() {
        System.out.println("test me");
    }
}
