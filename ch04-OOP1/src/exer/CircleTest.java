package exer;

import org.junit.Test;

public class CircleTest {
    @Test
    public void test1(){
        Circle c1 = new Circle();
        c1.setRadius(5.2);
        System.out.println(c1.getArea());
    }
}
