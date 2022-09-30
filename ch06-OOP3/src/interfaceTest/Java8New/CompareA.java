package interfaceTest.Java8New;

import java.util.zip.Deflater;

public interface CompareA {
    //静态方法
    public static void method1() {
        System.out.println("CompareA: method1");
    }
    public default void method2() {
        System.out.println("CompareA: method2");
    }
    public default void method3() {
        System.out.println("CompareA: method3");
    }
}
