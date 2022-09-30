package singleton;

/**
 * @Author mapKey
 * @Date 7/8/2022 11:05 AM
 * @Description 单例模式的懒汉式实现,什么时候要用instance实例,什么时候才创建

 * 好处:延迟时间创建对象,对象加载时间不像饿汉式要加载时间过长
 * 坏处:要考虑线程安全问题
 * @Since version-1.0
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Order o1 = Order.getInstance();
        Order o2 = Order.getInstance();
        //bank1 bank2是一个对象,地址值一样
        System.out.println(o1 == o2);
    }
}

class Order{
    //1.外部不能new对象--->私有化类的构造器
    private Order() {

    }
    //2.声明类的对象, 不初始化
    //4.该属性要在静态方法中使用 --> static
    private static Order instance = null;

    //3.类外部无法通过对象来调, 只能通过类来调方法,-->static
    //public static  synchronized Order getInstance() {
    public static  Order getInstance() {
        //条件判断过滤,避免每次都调方法都要new一次,在堆空间中new出多个对象
        //多个线程同时来调getInstance()
        if (instance == null) {
            synchronized (Bank.class) {
                //到这里可能阻塞或者cpu切换,当前某一线程进入就绪(WAITING)状态
                //在这时另一个线程也进来了,就会new多次,不为单例模式,
                // instance为共享数据
                if (instance == null) {
                    instance = new Order();
                }
            }
        }

        return instance;
    }
}