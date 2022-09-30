package code.d_Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class d_Properties {
    public static void main(String[] args)  {
        FileInputStream fis = null;
        try {
            Properties pros = new Properties();
            fis = new FileInputStream("jdbc.properties");
            pros.load(fis);

            String name = pros.getProperty("name");
            String password = pros.getProperty("password");

            System.out.println("name = " + name);
            System.out.println("password = " + password);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
