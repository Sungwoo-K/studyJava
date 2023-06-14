package ch05;

public class UserEx {
    public static void main(String[] args) {

        User user = new User("Sungwoo", 28,"swkim960715@gmail.com");

        user.displayUserInfo();

        String userEmail = user.getEmail();

        user.checkEmail(userEmail);

        int userAge = user.getAge();

        user.checkAge(userAge);
    }
}
