package exer1;

/**
 * @Author mapKey
 * @Date 2022-09-30-2:59 PM
 */
class MyThread_0 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "===========i = " + i);
            }
        }
    }
}

class MyThread_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + "******i = " + i);
            }
        }
    }
}

public class a_继承创建方式的课后练习 {
    public static void main(String[] args) {
        MyThread_0 t0 = new MyThread_0();

        MyThread_1 t1 = new MyThread_1();
        t0.start();
        t1.start();

    }
}
