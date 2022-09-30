package exer;
/**
 * @Author mapKey
 * @Date 7/13/2022 1:38 PM
 * @Since version-1.0
 * @Description
 * 创建三个窗口卖票,总票数100张, 实现Runnable接口方式
 */
class Window1 implements  Runnable {
    private int ticket = 100;

    Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":卖票, 票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w1 = new Window1();
        //公用一个window对象,ticket属性公用,不用加static
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();

    }
}
