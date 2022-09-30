/**
 * @Author mapKey
 * @Date 7/13/2022 11:24 AM
 * @Since version-1.0
 * @Description
 * 创建三个窗口卖票,总票数100张,继承Tread的方式
 *
 * 线程安全问题
 */package exer;

class Window extends Thread {

    private static int ticket = 100;
    public static Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            //当前类作为一个对象,且是惟一的,Window.class只加载一次
            synchronized (Window.class) {
            //synchronized (obj) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + ":卖票, 票号为:" + (101 - ticket));
                    ticket--;
                } else {
                    break;
                }
            }
        }

    }
}

 public class WindowTest {
     public static void main(String[] args) {
         Window t1 = new Window();
         Window t2 = new Window();
         Window t3 = new Window();

         t1.setName("窗口一");
         t2.setName("窗口二");
         t3.setName("窗口三");

         t1.start();
         t2.start();
         t3.start();
     }
}
