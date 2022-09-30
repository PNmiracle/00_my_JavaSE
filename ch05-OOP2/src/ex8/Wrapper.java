package ex8;

import java.util.Scanner;
import java.util.Vector;

/**
 * @Author mapKey
 * @Date 7/8/2022 7:27 AM
 * @Description 利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出
 * 最高分，并输出学生成绩等级。
 * 提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的
 * 长度。而向量类java.util.Vector可以根据需要动态伸缩。
 * 创建Vector对象： Vector v=new Vector();
 * 给向量添加元素： v.addElement(Object obj); //obj必须是对象
 * 取出向量中的元素： Object obj=v.elementAt(0);
 * 注意第一个元素的下标是0，返回值是Object类型的。
 * 计算向量的长度： v.size();
 * 若与最高分相差10分内： A等； 20分内： B等；
 * 30分内： C等；其它： D等
 * @Since version-1.0
 */
public class Wrapper {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        //boolean isFlag = true;
        Scanner sc = new Scanner(System.in);
        Integer max = Integer.MIN_VALUE;
        for (;;) {
            System.out.println("请输入学生成绩 (负数代表输入结束)");
            int num = sc.nextInt();
            if (num < 0) {
                //isFlag = false;
                break;
            }
            if (num > 100) {
                System.out.println("Wrong input, num: [0, 100]");
                continue;
            }
            v.addElement(num);
            max = Math.max(num, max);

        }
        //Integer max = v.elementAt(0);
        //for (Integer o : v) {
        //    max = Math.max(max, o);
        //    System.out.print(o + "\t");
        //}
        //System.out.println();
        char level;
        int i = 0   ;
        for (Integer in : v) {
            if (max - in <= 10) {
                //System.out.print("A\t");
                level = 'A';
            } else if (max - in <=20) {
                //System.out.print("B\t");
                level = 'B';

            } else if (max - in <=30) {
                //System.out.print("C\t");
                level = 'C';
            } else {
                //System.out.print("D\t" );
                level = 'D';
            }
            i++;
            System.out.println("Student-" + i + "score is " + in +", level is " + level);
        }

    }
}
