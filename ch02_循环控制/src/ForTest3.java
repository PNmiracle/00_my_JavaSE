import java.util.Scanner;
/*
从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。

说明：
1.不在循环条件部分限制次数的结构：while(true) , for(true)
2.结束循环的几种方式：
	方式一：循环条件部分返回false;
	方式二：在循环体中，执行break;
*/
public class ForTest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pSum = 0, nSum = 0;
        while (true) {
            int i = scanner.nextInt();
            if (i == 0) break;
            if (i > 0) {
                pSum++;
            } else {
                nSum++;
            }
        }
        System.out.println("pSum: " + pSum +", nSum: " + nSum);
    }
}
