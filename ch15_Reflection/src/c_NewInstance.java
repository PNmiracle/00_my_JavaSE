import org.junit.Test;

import java.util.Random;

public class c_NewInstance {
    @Test
    public void test1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class<?> clazz = Class.forName("Person");
        Object obj = clazz.newInstance();
        System.out.println("obj = " + obj);

    }
    @Test
    public void test2(){
        int num = new Random().nextInt(3);
        String classPath = "";
        switch (num) {
            case 0:
                classPath = "java.lang.String";
                break;
            case 1:
                classPath = "java.sql.Date";
                break;

            case 2:
                classPath = "Person";
                break;
        }
        try {
            Object obj = getInstance(classPath);
            System.out.println("obj = " + obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }

    public Object getInstance(String classPath) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName(classPath);
        return clazz.newInstance();
    }


}
