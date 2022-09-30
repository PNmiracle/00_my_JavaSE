import org.junit.Test;

public class ArrayFuzhi {
    @Test
    public void test1(){
        int[] arr = new int[20];
        boolean isFlag = false;
        for (int i = 0; i < arr.length; i++) {
            isFlag = false;
            do {
                arr[i] = (int)(Math.random() * 30 + 1);
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]){
                        isFlag = true;
                        break;
                    }
                }
            } while (isFlag);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
