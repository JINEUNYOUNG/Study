package access.b;

public class BankAccount {

    private int balance; //이 곳에서만 사용.

    public BankAccount() {
        balance = 0;
    }//초기화... 안해도 자동

    public void deposit(int amount) {
        //금액 검증
        if (isAmountValid(amount)){
            balance += amount;
       } else {
            System.out.println("유효하지않은 금액입니다. ");
        }
    }

    public void withdraw(int amount){
        if (isAmountValid(amount)&&balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("잔액이 부족하거나 유효하지 않은 금액.");
        }
    }

    public int getBalance(){
        return balance;
    }
    public boolean isAmountValid(int amount){
        return amount > 0; //0보다 클때 true
    }
}
