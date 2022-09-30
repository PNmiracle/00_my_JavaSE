package Exer4;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void withdraw(double amount){
        if (balance - amount >= 0) {
            balance -= amount;
        } else {
            throw new RuntimeException("Not sufficient funds");
        }
        System.out.println("Withdraw Succeeded :" + balance);
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit Succeeded :" + balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
