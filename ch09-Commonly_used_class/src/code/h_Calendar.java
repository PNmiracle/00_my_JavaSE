package code;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class h_Calendar {
    @Test
    public void test1(){
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.getClass());

        int days = instance.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //System.out.println(Calendar.DAY_OF_YEAR);
        System.out.println(instance.get(Calendar.DAY_OF_YEAR));

        instance.set(Calendar.DAY_OF_MONTH, 22);
        int days1 = instance.get(Calendar.DAY_OF_MONTH);
        System.out.println(days1);

    //    add()
        instance.add(Calendar.DAY_OF_MONTH, -3);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));

    //    getTime()
        Date date = instance.getTime();
        System.out.println(date);
        
    //    setTim()
        Date date1 = new Date();
        instance.setTime(date1);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));

    }

}
