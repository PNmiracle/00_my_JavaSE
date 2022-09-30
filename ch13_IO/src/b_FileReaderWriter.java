import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class b_FileReaderWriter {

    public static void main(String[] args) {
        File fi = new File("ch13_IO", "hello.txt");
        System.out.println(fi.getAbsoluteFile());
    }

    @Test
    public void testFileReader() {
        FileReader fr = null;
        try {
            File file = new File("hello.txt");
            System.out.println(file.getAbsoluteFile());
            fr = new FileReader(file);
            int data = fr.read();
            while ((data = fr.read()) != -1) {
                System.out.println((char) data);
                //data = fr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {

                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    @Test
    public void testFileReader1() throws IOException {
        FileReader fr = null;
        try {
            File file = new File("hello.txt");

            fr = new FileReader(file);

            char[] cbuf = new char[5];

            int len;
            while ((len = fr.read(cbuf)) != -1) {
                for (int i = 0; i < cbuf.length; i++) {
                    System.out.print(cbuf[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    @Test
    public void testFileWriter() throws IOException {
        File file = new File("hello1.txt");

        FileWriter fw = new FileWriter(file, false);

        fw.write("I have a dream!\n");
        fw.write("You need to have a dream!");


        fw.close();


    }

    @Test
    public void testFileReaderFileWriter() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File srcFile = new File("hello.txt");
            File destFile = new File("hello2.txt");

            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
                fw.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
