package code1;

/**
 * @Author mapKey
 * @Date 2022-09-30-4:49 PM
 */

class Window1 implements Runnable {
    // 天然的共享数据
    private int ticket = 100;
    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ":卖票, 票号为 : " + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}
public class d_多窗口卖票_实现Runnable接口方式 {
    public static void main(String[] args) {
        Window1 w = new Window1();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
