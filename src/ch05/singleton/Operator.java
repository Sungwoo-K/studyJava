package ch05.singleton;

public class Operator {

    private static Operator instance;

    private Operator() {
    }

    public static Operator getInstance() {
        if(instance == null) {
            instance = new Operator();
        }
        return instance;
    }
}
