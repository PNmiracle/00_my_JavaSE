package Encapsulation;

import org.junit.Test;

public class PersonTest {
    @Test
    public void test(){
        String str = "abc";
        String s = new String("abc");


        Person b = new Person();
        b.setAge(131);
        System.out.println(b.getAge());
    }
}
