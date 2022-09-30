package singleton;
/**
 * @Author mapKey
 * @Date 7/8/2022 11:04 AM
 * @Description 饿汉式单例模式, 一上来显式赋值的时候就造好对象
 * @Since version-1.0
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        //bank1 bank2是一个对象,地址值一样
        System.out.println(bank1 == bank2);
    }
}
class Bank {
    // 1.私有化类的构造器
    private Bank(){

    }
    //2. 只能内部创建类的对象, 不用public, 类的属性
    //4.要求此对象必须声明为静态的 该属性要在静态方法中使用 --> static
    private static Bank instance = new Bank();

    //提供公共的方法,返回类的对象 ,
    // 类外部无法通过对象来调, 只能通过类来调方法,-->static
    public static Bank getInstance() {
        return instance;
    }
}