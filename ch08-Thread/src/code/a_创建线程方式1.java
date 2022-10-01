package code;

/**
 * @Author mapKey
 * @Date 7/12/2022 2:20 PM
 * @Since version-1.0
 * @Description 创建多线程的方式一:Thread类的子类
 *
 * //1.创建继承于Thread类的子类
 *     //2.重写run方法
 *     //3.创建子类的对象
 *     //4.通过子类对象调用start方法
 */
public class a_创建线程方式1 {
    public static void main(String[] args) {
        //3.创建子类的对象
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        //4.通过子类对象调用start方法
        //① 启动当前线程, ②调用当前线程的run()
        t1.start();
        t2.start();
        System.out.println("hello");

        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + "i = *******************" + i);
            }

        }
    }
}

//1.创建继承于Thread类的子类
class MyThread extends Thread {
    //2.重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "i = " + i);
            }
        }
    }
}