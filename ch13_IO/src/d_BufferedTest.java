import org.junit.Test;

import java.io.*;

public class d_BufferedTest {
    @Test
    public void test1() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcFile = new File("爱情与友情.jpg");
            File destFile = new File("爱情与友情3.jpg");

            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buffer = new byte[10];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        //fos.close();
        //fis.close();
    }

    @Test
    public void test3() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(new File("dbcp1.txt")));
            bw = new BufferedWriter(new FileWriter(new File("dbcp2.txt")));

            //char[] cbuf = new char[1024];
            //int len;
            //
            //while ((len = br.read(cbuf)) != -1) {
            //    bw.write(cbuf, 0, len);
            //}

            String data;
            while ((data = br.readLine()) != null) {
                //bw.write(data + "\n");
                bw.write(data);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
