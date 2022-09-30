package a_Class;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class a_Class {
    @Test
    public void test2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<Person> clazz = Person.class;
        Constructor<Person> cons = clazz.getConstructor(String.class, int.class);
        Person p = cons.newInstance("Tom", 12);
        System.out.println("p = " + p);
        Field age = clazz.getDeclaredField("age");
        age.set(p, 10);

        System.out.println("p = " + p);

        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);

        Constructor<Person> cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);

        Person p1 = cons1.newInstance("Jerry");
        System.out.println("p1 = " + p1);

        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1, "Hanmeimei");
        System.out.println("p1 = " + p1);

        Method showNation = clazz.getDeclaredMethod("showNation", String.class);

        showNation.setAccessible(true);

        Object o = showNation.invoke(p1, "中国");
        System.out.println("o = " + o);
    }

    @Test
    public void test3() throws ClassNotFoundException {
        Class<Person> clazz1 = Person.class;
        System.out.println("clazz1 = " + clazz1);

        Person p1 = new Person();
        Class<? extends Person> clazz2 = p1.getClass();
        System.out.println("clazz2 = " + clazz2);

        Class<?> clazz3 = Class.forName("a_Class.Person");
        System.out.println("clazz3 = " + clazz3);

        ClassLoader classLoader = a_Class.class.getClassLoader();
        Class<?> clazz44 = classLoader.loadClass("a_Class.Person");
        System.out.println("clazz44 = " + clazz44);

        System.out.println((clazz1 == clazz44));

    }
}
