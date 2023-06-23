package ch08.interfaceEx2;

public class Account implements Taxable, Bankable, Loanable {
    private double balance;

    private double loan;

    private double taxRate;

    public Account(double balance, double loan, double taxRate) {
        this.balance = balance;
        this.loan = loan;
        this.taxRate = taxRate * 0.01;
    }

    @Override
    public void calculateTax() {
        int tax = (int)(this.balance * this.taxRate);
        System.out.println("세금은 : " + tax + "원 입니다.");
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("잔고가 부족합니다.");
        }
    }

    @Override
    public void calculateInterest() {
        int loanInterest = (int) (this.loan * this.taxRate);
        System.out.println("대출금의 이자는 " + loanInterest + "원 입니다.");
    }
}
