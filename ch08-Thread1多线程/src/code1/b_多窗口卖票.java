package code1;

/**
 * @Author mapKey
 * @Date 2022-09-30-3:56 PM
 */
class Window extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {

            synchronized (Window.class) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(getName() + ": 卖票, 票号为 :" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class b_多窗口卖票 {
    public static void main(String[] args) {
        Window t1 = new Window();
        Window t2 = new Window();
        Window t3 = new Window();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
