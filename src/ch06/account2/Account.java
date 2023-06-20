package ch06.account2;



// 계좌 클래스
public class Account {
    private double balance;         // 잔액

    public Account(double balance) {
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        // **코드 작성
        // 입금 금액 만큼 해당 계좌객체에 잔고(balance) 추가
        this.balance += amount;
    }

    public void withdraw(double amount) {
        // **코드 작성
        // 출금 금액 만큼 해당 계좌객체에 잔고(balance) 차감
        // 단, 출금 금액보다 잔액이 적으면 오류 메시지를 출력하면 차감하지 않음
        if(this.balance < amount){
            System.out.println("잔액이 부족합니다.");
        } else {
            this.balance -= amount;
        }
    }
}
