/**
 * @Author mapKey
 * @Date 7/9/2022 4:05 PM
 * @Description Exception in thread "main" java.lang.StackOverflowError
 * @Since version-1.0
 */

import org.junit.Test;


public class ErrorTest {
    @Test
    public void test1(){
        String str = "123";
        str = "abc";
        try {
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();

        }
    }
    public static void main(String[] args) {
        main(args);
    }
}
