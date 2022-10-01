package code1;

/**
 * @Author mapKey
 * @Date 2022-10-01-1:05 PM
 */
public class e_懒汉式的安全问题 {

}

class Bank {
    private Bank() {

    }

    private static Bank instance = null;

    public static Bank getInstance() {

        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}

