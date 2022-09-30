import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class i_RandomAccessFile {
    @Test
    public void test1() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile(new File("爱情与友情.jpg"), "r");
        RandomAccessFile raf2 = new RandomAccessFile(new File("爱情与友情5.jpg"), "r");

        byte[] buffer = new byte[1024];
        int len;
        while ((len = raf1.read(buffer)) != -1) {
            raf2.write(buffer, 0, len);

        }

        raf1.close();
        raf2.close();

    }

    @Test
    public void test3() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("hello.txt", "rw");

        raf1.seek(3);

        StringBuilder builder = new StringBuilder((int) new File("hello.txt").length());
        byte[] buffer = new byte[20];
        int len;
        while ((len = raf1.read(buffer)) != -1) {
            builder.append(new String(buffer,0,len));
        }
        raf1.seek(3);
        raf1.write("xyz".getBytes());

        raf1.write(builder.toString().getBytes());

        raf1.close();

    }
}
