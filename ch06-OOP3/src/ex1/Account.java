package ex1;

public class Account {
    private int id;
    private int psw;
    private double balance;

    public static double interestRate = 0.02;
    public static double minBalance;
    private static int init = 1001;



    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }


    public Account() {
        id = init++;

    }

    public Account(int id, int psw) {
        this();
        this.id = id;
        this.psw = psw;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPsw() {
        return psw;
    }

    public void setPsw(int psw) {
        this.psw = psw;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", psw=" + psw +
                '}';
    }
}
