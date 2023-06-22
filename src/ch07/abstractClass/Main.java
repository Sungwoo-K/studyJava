package ch07.abstractClass;

public class Main {
    public static void main(String[] args) {
        Account savings = new SavingsAccount("12345", 1000, 0.01);
        Account checking = new CheckingAccount("67890", 2000);

        savings.deposit(500);
        savings.withdraw(200);
        savings.endOfMonth();

        checking.deposit(1000);
        checking.withdraw(500);
        checking.endOfMonth();
    }
}
