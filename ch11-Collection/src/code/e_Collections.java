package code;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class e_Collections {
    @Test
    public void test1(){
        ArrayList list = new ArrayList();

        list.add(123);
        list.add(45);
        list.add(765);
        list.add(765);
        list.add(765);
        list.add(-97);
        list.add(0);
        System.out.println("list = " + list);
        //Collections.reverse(list);

        //Collections.shuffle(list);
        //Collections.sort(list);
        //Collections.swap(list,1,2);
        int frequency = Collections.frequency(list, 765);
        System.out.println("frequency = " + frequency);


        System.out.println("list = " + list);

    }
}
