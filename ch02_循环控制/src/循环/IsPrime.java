package 循环;

public class IsPrime {
    public static void main(String[] args) {
        //boolean isFlag = true;
        long start = System.currentTimeMillis();
        label :for (int i = 2; i <= 100000; i++) {

            for (int j = 2; j < Math.sqrt(i); j++) {//76
                if (i % j == 0) {
                    //isFlag = false;
                    continue label;//2698  19546
                }

            }

            //if (isFlag == true) {
            //    System.out.print(i + "\t");
            //}
            //isFlag = true;
            System.out.println(i + "\t");
        }
        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println("时间为" + (end - start) + "ms");
    }
}
