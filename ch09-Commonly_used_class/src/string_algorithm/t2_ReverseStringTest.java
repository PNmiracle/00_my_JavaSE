package string_algorithm;

import static org.junit.Assert.*;

public class t2_ReverseStringTest {

    @org.junit.Test
    public void reverseTest() {
        String str = "abcdefg";
        t2_ReverseString t2 = new t2_ReverseString();
        System.out.println(t2.reverse2(str, 2, 5));
    }

}