package code1;

/**
 * @Author mapKey
 * @Date 2022-10-01-2:22 PM1
 */
class Number implements Runnable {
    private int number = 1;
    @Override
    public void run() {
        while (true) {

            synchronized (this) {
                notify();
                if (number <= 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "number = " + number);
                    number++;
                    // 使得调用wait()的线程进入阻塞状态
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    break;
                }
            }
        }
    }
}
public class h_线程通信 {
    public static void main(String[] args) {
        Number number = new Number();

        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("线程1:");
        t2.setName("线程2:");
        t1.start();
        t2.start();

    }
}
