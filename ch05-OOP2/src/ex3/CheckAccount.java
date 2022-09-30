package ex3;

public class CheckAccount extends Account {
    private int overdraft;
    public CheckAccount() {
    }

    public CheckAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    public CheckAccount(int id, double balance, double annualInterestRate, int overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public int getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        //super.withdraw(amount);
        if (amount <= getBalance()) {
            //getBalance() -= amount;
            /*setBalance(getBalance() - amount);
            System.out.println("Withdraw succeeded! Your balance is:" + getBalance());
            System.out.println("Your overdraft now is :" + overdraft);*/
            super.withdraw(amount);//一般不提供setAmount()
            return;//流程控制 三选一
        }

        if (amount - getBalance() <= overdraft) {
            double dif = amount - getBalance();
            //与下句的顺序
            overdraft -= dif;
            /*setBalance(0);*/

            super.withdraw(getBalance());
            //System.out.println("Your balance now is :" + getBalance());
            //System.out.println("Your overdraft now is :" + overdraft);
        } else {
            System.out.println("No sufficient overdraft!\n");
            //System.out.println("Your balance now is :" + getBalance());
            //System.out.println("Your overdraft now is :" + overdraft);
        }

    }
}
