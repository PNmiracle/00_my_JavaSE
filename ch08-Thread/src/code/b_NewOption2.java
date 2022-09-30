/**
 * @Author mapKey
 * @Date 7/13/2022 11:40 AM
 * @Since version-1.0
 * @Description
 * 创建多线程的方式二:实现Runnable接口
 * 1.创建实现Runnable接口的类
 * 2.实现类去实现Runnable接口中的抽象方法run()
 * 3.创建实现类的对象
 * 4.将此对象作为参数传递到Thread类的构造器中,创建Thread类的对象
 * 5.通过Thread类的对象调用start()
 */package code;
// 1.创建实现Runnable接口的类
class MThread implements Runnable{
    // * 2.实现类去实现Runnable接口中的抽象方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}
public class b_NewOption2 {
    public static void main(String[] args) {
        //3.创建实现类的对象
        MThread mThread = new MThread();
        // 4.将此对象作为参数传递到Thread类的构造器中,创建Thread类的对象
        Thread t1 = new Thread(mThread);
        //5.通过Thread类的对象调用start():①:启动线程
        // ②:调用当前线程的run()-->调用Runnable类型的target的run()
        t1.start();

        Thread t2 = new Thread(mThread);
        t2.start();
    }
}
