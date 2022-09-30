package ex3;

public class Account {
    private int id;
    protected double balance;
    private double annualInterestRate;

    public Account() {
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            //System.out.println("Withdraw succeeded! Your balance is:" + balance);
        } else {
            //System.out.println("No sufficient balance!");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        //System.out.println("Deposit succeeded! Now your balance is :" + balance);
    }

    public double getMonthlyInterest(){
        return annualInterestRate / 12;
    }
}
