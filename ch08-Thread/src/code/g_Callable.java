package code;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的方式三：实现Callable接口。 --- JDK 5.0新增
 *
 *
 * 如何理解实现Callable接口的方式创建多线程比实现Runnable接口创建多线程方式强大？
 * 1. call()可以有返回值的。
 * 2. call()可以抛出异常，被外面的操作捕获，获取异常的信息
 * 3. Callable是支持泛型的
 *
 */
//1.创建实现Callable接口的实现类
class NumThread implements Callable {
    //2.实现(重写)call()方法,将此线程所需执行的操作声明在call方法中
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i + Thread.currentThread().getName());
                sum += i;
            }
        }
        return sum;

    }
}
public class g_Callable {
    public static void main(String[] args) {
        //3.创建Callable接口实现类的对象
        NumThread numThread = new NumThread();
        //4.将Callable接口实现类的对象 作为参数传递到FutureTask构造器中,创建FutureTask类的对象
        FutureTask futureTask = new FutureTask(numThread);
        //5.
        new Thread(futureTask).start();

        try {
            //6.获取Callable中call()的返回值
            //get方法返回值为Callable实现类重写call()的返回值
            Object sum = futureTask.get();
            System.out.println("sum = " + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
