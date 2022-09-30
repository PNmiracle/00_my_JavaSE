package code;
/**
 * @Author mapKey
 * @Date 7/12/2022 2:54 PM
 * @Since version-1.0
 * @Description
 * Thread类中的常用方法
 1.start():①启动线程 ②调用当前线程的run()
 2.run():重写

3.//释放当前cpu的执行权
yield();
 4.//在线程a中调用线程b的join(),此时线程a就进入阻塞状态,直到线程b执行完
h1.join();--------(强行霸道插入)
 5.sleep()




 */
class HelloThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                //try {
                //    sleep(10);
                //} catch (InterruptedException e) {
                //    e.printStackTrace();
                //}
                System.out.println("i = " + i + getName() + Thread.currentThread().getPriority());
            }
            if (i % 20 == 0) {
                //释放当前cpu的执行权
                yield();
            }
        }
    }

    public HelloThread() {
    }

    public HelloThread(String name) {
        super(name);
    }
}

public class c_ThreadClassMethod {
    public static void main(String[] args) {
        HelloThread h1 = new HelloThread("线程一");
        h1.setPriority(Thread.MAX_PRIORITY);
        h1.start();
        Thread.currentThread().setName("主线程!");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i + "_____________"+ Thread.currentThread().getName() + "_____"  +Thread.currentThread().getPriority());
            }
            if (i == 20) {
                try {
                    //在线程a中调用线程b的join(),此时线程a就进入阻塞状态,直到线程b执行完
                    h1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(h1.isAlive());
            }
        }

        System.out.println(h1.isAlive());
    }
}
