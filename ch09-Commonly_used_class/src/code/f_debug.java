package code;

import org.junit.Test;

public class f_debug {
    @Test
    public void test1(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        System.out.println(sb.length());
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);
    }
}
