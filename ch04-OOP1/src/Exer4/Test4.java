package Exer4;

public class Test4 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Steven","Jobs");
        bank.addCustomer("Bill","Gates");
        bank.addCustomer("Donald","Trump");
        System.out.println(bank.getNumberOfCustomers());
        Customer c0 = bank.getCustomer(0);
        c0.setAccount(new Account(1000));
        System.out.println(c0.toString());
        Account c0Acc = c0.getAccount();
        c0Acc.deposit(500);
        c0Acc.deposit(500);

        c0Acc.withdraw(800);

    }
}
