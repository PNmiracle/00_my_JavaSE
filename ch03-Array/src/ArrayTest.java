import org.junit.Test;

import java.util.Arrays;

public class ArrayTest {
    @Test
    public void test6(){
        int[] arr = new int[]{1, 5, 6, 7, 8, 11, 22, 33, 55};
        int[] arr1 = new int[]{1, 5, 6, 7, 8, 11, 33,22, 33, 55};
        int i = Arrays.binarySearch(arr, 5);
        Arrays.sort(arr);
        boolean equals = Arrays.equals(arr, arr1);
        System.out.println(i);
        System.out.println(Arrays.toString(arr));
    }
    /*二分法Search*/
    @Test
    public void test5() {

        int[] arr = new int[]{1, 5, 6, 7, 8, 11, 22, 33, 55};
        //Arrays.binarySearch(arr,5)

        int lo = 0, hi = arr.length - 1;
        int dest = 9;


        boolean isFind = false;
        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            if (arr[mid] == dest) {
                System.out.println("Find it! The index is:" + mid);
                isFind = true;
                break;
            } else if (arr[mid] < dest) {
                lo = mid + 1;
            } else  {
                hi = mid - 1;
            }
        }
        if (isFind == false){
            System.out.println("Not Find!");
        }
    }

    @Test
    public void test4() {
        String[] arr = new String[]{"JJ", "DD", "MM", "BB", "GG", "AA"};
        boolean isFind = false;
        String dest = "BB";
        //for (String s : arr) {
        //    if (dest.equals(s)) {
        //        isFlag = true;
        //        break;
        //    }
        //}
        //System.out.println(isFlag);
        for (int i = 0; i < arr.length; i++) {
            if (dest.equals(arr[i])) {
                isFind = true;
                System.out.println("Find the element. The position is " + i);
                break;
            }
        }
        if (isFind == false) {
            System.out.println("Not Find!");
        }

    }

    @Test
    public void test3() {
        String[] arr = new String[]{"JJ", "DD", "MM", "BB", "GG", "AA"};

        String temp = "";
        int l = arr.length;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }
        for (String s : arr) {
            System.out.println(s);
        }

    }

    /**/
    @Test
    public void test2() {
        int[] arr = new int[10];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        double avg = 0.0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90 + 10);
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }
        avg = 1.0 * sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("Maximum:" + max + "\t" + "Minimum:" + min + "\t" + "Sum:" + sum + "\t" + "Avg" + avg);

    }

    @Test
    public void test1() {
        String[] names = new String[]{"a", "b", "c", "d"};
        for (String name : names) {
            System.out.println(name);
        }

    }
}
