package code;

import org.testng.annotations.Test;

import java.util.Date;

public class d_DateTime {
    @Test
    public void test2(){
        Date date1 = new Date();
        System.out.println(date1.toString());

        long time = date1.getTime();
        System.out.println("time = " + time);
        Date date2 = new Date(1657958882283L);
        System.out.println("date2 = " + date2);
        java.sql.Date date3 = new java.sql.Date(1657958882283L);
        System.out.println("date3 = " + date3);
    //    将util下的date转为sql下的date
        Date date6 = new Date();
        java.sql.Date date7 = new java.sql.Date(date6.getTime());
        System.out.println("date7 = " + date7);
    }
}
