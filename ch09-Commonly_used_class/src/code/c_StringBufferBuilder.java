package code;

import org.testng.annotations.Test;

public class c_StringBufferBuilder {
    @Test
    public void test1(){
        StringBuffer s1 = new StringBuffer("abc");
        //增
        s1.append(1);
        s1.append('1');
        System.out.println("s1 = " + s1);
        //删
        //s1.delete(2,4);
        //改  查charAt()
        //s1.replace(2,4,"hello")
        //插
        //s1.insert(2,false);
        //s1.reverse();
        //System.out.println(s1.substring(1, 3));

        System.out.println("s1 = " + s1);


    }

}
