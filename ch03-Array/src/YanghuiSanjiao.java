import java.util.Arrays;

public class YanghuiSanjiao {
    public static void main(String[] args) {
        int[][] yanghui = new int[10][];//声明并初始化

        for (int i = 0; i < 10; i++) {
            yanghui[i] = new int[i + 1];
            //Arrays.fill(yanghui[i] , 1);
            yanghui[i][0] = yanghui[i][i] = 1;
        }

        for (int i = 2; i < yanghui.length; i++) {
            for (int j = 1; j < yanghui[i].length - 1; j++) {
                yanghui[i][j] = yanghui[i - 1][j] + yanghui[i - 1][j - 1];
            }
        }
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
