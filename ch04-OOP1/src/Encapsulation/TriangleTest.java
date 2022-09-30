package Encapsulation;

import org.junit.Test;

public class TriangleTest {
    @Test
    public void test(){
        //Triangle t1 = new Triangle(1.6, 2.4);
        Triangle t1 = new Triangle(1.6, 2.4);
        t1.setBase(5.1);

        System.out.println(t1.findArea());

    }
}
