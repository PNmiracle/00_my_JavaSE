package code.k_Comparable;

import org.junit.Test;

import java.util.Arrays;

public class k_Comparable {
    @Test
    public void test3(){

    }
    @Test
    public void test2(){
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("lenovoMouse",34);
        arr[1] = new Goods("xiaomiMouse",12);
        arr[2] = new Goods("dellMouse",43);
        arr[3] = new Goods("huaweiMouse",56);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    @Test
    public void test1(){
        String[] arr = new String[] {"AA", "CC", "KK", "MM", "GG", "JJ", "DD"};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
