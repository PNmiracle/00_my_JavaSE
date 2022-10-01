package code1;

/**
 * @Author mapKey
 * @Date 2022-09-30-4:07 PM
 */
class MThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }
    }
}

public class c_多线程创建方式二 {
    public static void main(String[] args) {
        MThread mThread = new MThread();
        Thread t1 = new Thread(mThread);
        t1.start();
    }
}
