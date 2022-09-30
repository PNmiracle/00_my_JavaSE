import org.junit.Test;

import java.util.Comparator;

public class a_lambda {
    @Test
    public void test1(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("I love you!");
            }
        };

        r1.run();

        Runnable r2 = () -> System.out.println("I love you too!");

        r2.run();
    }

    @Test
    public void test2(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };

        System.out.println(com1.compare(12, 21));

        Comparator<Integer> com2 = (o1, o2) -> Integer.compare(o1, o2);


        Comparator<Integer> com3 =  Integer :: compare;
    }
}
