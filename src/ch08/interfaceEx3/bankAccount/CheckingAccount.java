package ch08.interfaceEx3.bankAccount;

public class CheckingAccount implements BankAccount{

    private double balance;

    public CheckingAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if(this.balance >= amount){
            this.balance -= amount;
        } else {
            System.out.println("예금통장의 잔고가 부족합니다.");
        }
    }

    @Override
    public void getBalance() {
        System.out.println("예금통장의 잔고는 : " + (int)this.balance + "원 입니다.");
    }
}
