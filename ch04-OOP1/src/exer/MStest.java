package exer;

import org.junit.Test;

import java.util.Arrays;

public class MStest<test> {
    @Test
    public void test2(){
        char[] arr1 = new char[] {'a', 'b', 'c'};
        System.out.println(arr1);

    }
    @Test
    public void test(){
        int[] arr = new int[]{12, 3, 3, 34, 56, 77, 432};
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = arr[i] / arr[0];
        }

        System.out.println(Arrays.toString(arr));
    }
}
