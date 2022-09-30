import org.junit.Test;

import java.io.InputStream;
import java.util.Properties;

public class b_ClassLoader {
    @Test
    public void test1(){
        ClassLoader classLoader = b_ClassLoader.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);
    }



    @Test
    public void test2() throws Exception {
        Properties pros = new Properties();
        //FileInputStream fis = new FileInputStream("jdbc.properties");
        //pros.load(fis);

        ClassLoader classLoader = b_ClassLoader.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc1.properties");
        pros.load(is);

        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        System.out.println("user = " + user);
        System.out.println("password = " + password);
    }
}
