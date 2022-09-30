import java.util.Scanner;

/*
从键盘输入一个整数（1~20）
则以该数字为矩阵的大小，把1,2,3…n*n 的数字按照顺时针螺旋的形式填入其中。例如： 输入数字2，则程序输出：
1 2
4 3
输入数字3，则程序输出：
1 2 3
8 9 4
7 6 5
输入数字4， 则程序输出：
1   2   3   4
12  13  14  5
11  16  15  6
10  9   8   7
* */
public class Huixingshu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int x = scanner.nextInt();
        int[][] arr = new int[x][x];
        int m = x * x;
        int k = 1;// 1:向右 2:下 3:左 4:上
        int i = 0, j = 0;//行下标 列下标
        for (int s = 1; s <= m; s++) {
            if (k == 1) {
                if (i >= 0 && i < x && j >= 0 && j < x && arr[i][j] == 0) {
                    arr[i][j++] = s;
                } else {
                    k = 2;
                    i++;//换方向:下
                    j--;//撤销多走的
                    s--;//撤销
                    continue;
                }
            }

            if (k == 2) {
                if (i >= 0 && i < x && j >= 0 && j < x && arr[i][j] == 0){
                    arr[i++][j] = s;
                }  else {
                    k = 3;
                    j--;//换方向:左
                    i--;
                    s--;//撤销
                    continue;
                }
            }

            if (k == 3) {
                if (i >= 0 && i < x && j >= 0 && j < x && arr[i][j] == 0) {
                    arr[i][j--] = s;
                } else {
                    k = 4;
                    i--; //换方向:上
                    j++;//撤销
                    s--;//撤销
                    continue;
                }
            }

            if (k == 4) {
                if (i >= 0 && i < x && j >= 0 && j < x && arr[i][j] == 0) {
                    arr[i--][j] = s;
                } else {
                    k = 1;
                    j++;
                    i++;
                    s--;//撤销
                    continue;
                }
            }
        }

        for (int i1 = 0; i1 < arr.length; i1++) {
            for (int i2 = 0; i2 < arr[i1].length; i2++) {
                System.out.print(arr[i1][i2] + "\t");
            }
            System.out.println();
        }
    }
}
