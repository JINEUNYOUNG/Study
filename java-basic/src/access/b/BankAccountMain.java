package access.b;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.deposit(1000);
        System.out.println(bank.getBalance()+"원입니다.");
        bank.withdraw(3000);
        System.out.println(bank.getBalance()+"원입니다.");
    }
}
