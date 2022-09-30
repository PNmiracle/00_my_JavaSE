package code;

import org.junit.Test;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class j_Instant {
    @Test
    public void test1(){
        //now():
        Instant instant = Instant.now();
        System.out.println("instant = " + instant);
        //atOffset():
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println("offsetDateTime = " + offsetDateTime);

        //获取对应毫秒数
        long toEpochMilli = instant.toEpochMilli();
        System.out.println("toEpochMilli = " + toEpochMilli);

        return;
    }
}
