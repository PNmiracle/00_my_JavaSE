package TemplateTest;
/**
 * @Author mapKey
 * @Date 7/8/2022 8:39 PM
 * @Description
 * @Since version-1.0
 */
public class TemplateTest {
    public static void main(String[] args) {
        SubTemplate t = new SubTemplate();
        t.spendTime();
    }
}

abstract class Template {
    /**
     * @Description 计算某段代码所需的时间
     * @Param
     * @Return
     */
    public void spendTime() {
        long start = System.currentTimeMillis();
        //不确定(可变)的部分代码
        code();

        long end = System.currentTimeMillis();
        System.out.println("It costs :" + (end - start) + "ms");

    }

    public abstract void code();
}

class SubTemplate extends Template {

    @Override
    public void code() {
        //boolean isFlag = true;

        label: for (int i = 2; i < 100; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    //isFlag = false;
                    //break;
                    continue label;
                }
            }

                System.out.println(i + "\t");
            //if (isFlag) {
            //}
            //isFlag = true;
        }
    }
}