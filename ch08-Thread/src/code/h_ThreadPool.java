package code;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 创建线程的方式四：使用线程池
 *
 * 好处：
 * 1.提高响应速度（减少了创建新线程的时间）
 * 2.降低资源消耗（重复利用线程池中线程，不需要每次都创建）
 * 3.便于线程管理
 *      corePoolSize：核心池的大小
 *      maximumPoolSize：最大线程数
 *      keepAliveTime：线程没有任务时最多保持多长时间后会终止
 *
 *
 * 面试题：创建多线程有几种方式？四种！
 * */
class NumberThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i + Thread.currentThread().getName());
            }
        }
    }
}
class NumberThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println("i = *****" + i + Thread.currentThread().getName());
            }
        }
    }
}
public class h_ThreadPool {
    public static void main(String[] args) {
        //1.提供指定数量的线程池
        ExecutorService service1 = Executors.newFixedThreadPool(10);
            //class java.util.concurrent.ThreadPoolExecutor
        ThreadPoolExecutor service = (ThreadPoolExecutor)service1;
            //    设置线程池的属性
        System.out.println(service.getClass());
        service.setCorePoolSize(15);
            //service.setKeepAliveTime();
        //2.执行指定的线程的操作
            //适合使用于Runnable实现类的对象
        service.execute(new NumberThread());
        service.execute(new NumberThread1());
            //适合使用于Callable实现类的对象
        //service.submit()
        //3.关闭线程池-
        service.shutdown();
    }
}
