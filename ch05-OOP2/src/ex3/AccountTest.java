package ex3;

import jdk.nashorn.internal.ir.WithNode;

/**
 * @Author mapKey
 * @Date 7/5/2022 7:13 PM
 * @Description
 * 写一个用户程序测试 Account 类。在用户程序中，创建一个账号为 1122、余额为 20000、
 * 年利率 4.5%的 Account 对象。使用 withdraw 方法提款 30000 元，并打印余额。
 * 再使用 withdraw 方法提款 2500 元，使用 deposit 方法存款 3000 元，
 * 然后打印余额和月利率
 *
 *
 * @Since version-1.0
 */

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 0.045);
        account.withdraw(3000);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance :" + account.getBalance());
        System.out.println("Monthly interest :" + account.getMonthlyInterest());

        System.out.println("************************");
        CheckAccount che = new CheckAccount(0000,20000,0.045,5000);
        //che.balance = 1;
        che.withdraw(5000);
        System.out.println("Your balance is:" + che.getBalance());
        System.out.println("Your overdraft is :" + che.getOverdraft());
        che.withdraw(18000);
        System.out.println("Your balance is:" + che.getBalance());
        System.out.println("Your overdraft is :" + che.getOverdraft());
        che.withdraw(3000);
        System.out.println("Your balance is:" + che.getBalance());
        System.out.println("Your overdraft is :" + che.getOverdraft());


    }
}
