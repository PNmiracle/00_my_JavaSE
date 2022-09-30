package ex6;
/**
 * @Author mapKey
 * @Date 7/6/2022 4:42 PM
 * @Description 编写Order类，有int型的orderId， String型的orderName，相应的
 * getter()和setter()方法，两个参数的构造器，重写父类的equals()方法：
 * public boolean equals(Object obj)， 并判断测试类中创建的两个对象是否
 * 相等
 * @Since version-1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order(1001, "张三");
        Order order1 = new Order(1001, "张三");
        System.out.println(order.equals(order1));
    }
}
