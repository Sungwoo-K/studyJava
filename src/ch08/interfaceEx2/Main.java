package ch08.interfaceEx2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(85);
        student.calculateGrade();
        student.study();
        System.out.println("-------------------");
        Account account = new Account(50000, 2000, 10);
        account.calculateTax();
        System.out.println("-------------------");
        account.deposit(50000);
        account.calculateTax();
        System.out.println("-------------------");
        account.withdraw(200000);
        System.out.println("-------------------");
        account.withdraw(20000);
        account.calculateTax();
        System.out.println("-------------------");
        account.calculateInterest();

    }
}
