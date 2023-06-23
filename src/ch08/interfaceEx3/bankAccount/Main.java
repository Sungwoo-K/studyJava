package ch08.interfaceEx3.bankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new CheckingAccount(50000);
        BankAccount bankAccount2 = new SavingsAccount(100000);

        bankAccount1.getBalance();
        bankAccount1.deposit(50000);
        bankAccount1.getBalance();
        bankAccount1.withdraw(40000);
        bankAccount1.getBalance();

        System.out.println("--------------------");

        bankAccount2.getBalance();
        bankAccount2.deposit(50000);
        bankAccount2.getBalance();
        bankAccount2.withdraw(40000);
        bankAccount2.getBalance();
    }



}
