package code1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author mapKey
 * @Date 2022-10-01-1:45 PM
 */
class Window2 implements Runnable {
    private int ticket = 100;

    private ReentrantLock lock = new ReentrantLock(true);
    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();

                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }


                    System.out.println(Thread.currentThread().getName() + ": sell ticket, The Num is : " + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
public class g_Lock锁_解决安全方式三 {
    public static void main(String[] args) {
        Window2 w = new Window2();

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
