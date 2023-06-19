package ch05.accessModifier;

public class BackAccount {
    private int balance; // private 필드

    private void deductFunds(int amount) {
        if(amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}
