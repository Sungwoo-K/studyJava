package ch01;

public class Strings {
    public static void main(String[] args) {
        String myName = "Sungwoo";
        System.out.println(myName);

        String firstName = new String("John");
        String lastName = "Doe";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        String message = "이렇게 \"하고\" \n싶은데";

        System.out.println(message);


    }
}
