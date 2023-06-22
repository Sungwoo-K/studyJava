package ch07.abstractClass;

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    void endOfMonth() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of " + interest + " added. New balance: " + balance);
    }
}
