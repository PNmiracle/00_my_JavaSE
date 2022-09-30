package code;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class i_LocalDate {
    @Test
    public void test1(){
        //.now():相当于实例化 静态方法
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);


    //    of():设置指定的年, 月, 日, 时, 分, 秒 无偏移量
        LocalDateTime localDateTime1 = localDateTime.of(2020, 10, 6, 13, 23, 43);
        System.out.println("localDateTime1 = " + localDateTime1);

    //    getXXX()
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getMonth());

    //    with()设置相关的属性
    //  有返回值  -->  不可变性
        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println("localDate = " + localDate);
        System.out.println("localDate1 = " + localDate1);
        //plus()
        LocalDateTime localDateTime2 = localDateTime.plusMonths(3);
        System.out.println("localDateTime2 = " + localDateTime2);

        //minusXxx()
        LocalDateTime localDateTime3 = localDateTime.minusDays(6);
        System.out.println("localDateTime3 = " + localDateTime3);
    }
}
