package code1;

/**
 * @Author mapKey
 * @Date 2022-09-30-2:41 PM1
 */

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(getName() + " = " + i);
            }
        }
    }
}

public class a_多线程创建方式一 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        MyThread t2 = new MyThread();
        t2.start();
        //t1.run();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 10 == 0) {
                        System.out.println(Thread.currentThread().getName() + " = " + i);
                    }
                }
            }
        }.start();
        for (int j = 0; j < 100; j++) {
            if (j % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " = " + j);
            }
        }
    }
}
