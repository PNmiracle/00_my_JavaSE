
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class e_InputStreamReader {
    @Test
    public void test1() throws IOException {
        FileInputStream fis = new FileInputStream("dbcp1.txt");
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

        char[] cbuf = new char[20];
        int len;

        while ((len = isr.read(cbuf)) != -1) {
            String str = new String(cbuf, 0, len);
            System.out.print(str);
        }

        isr.close();
        fis.close();
    }

    @Test
    public void test2(){

    }
}
