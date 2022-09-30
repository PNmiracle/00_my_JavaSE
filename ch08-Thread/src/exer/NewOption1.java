package exer;
/**
 * @Author mapKey
 * @Date 7/12/2022 2:43 PM
 * @Since version-1.0
 * @Description
 *
 */

public class NewOption1 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("i = " + i + "*********" + Thread.currentThread().getName());
                }
            }
        }.start();
        t1.start();
        t2.start();
    }

}
class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i + Thread.currentThread().getName());
            }
        }
    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println("i = " + i + "----------" + Thread.currentThread().getName());
            }
        }
    }
}