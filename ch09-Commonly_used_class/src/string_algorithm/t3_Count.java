/**
 * @Author mapKey
 * @Date 7/16/2022 7:09 PM
 * @Since version-1.0
 * @Description 获取一个字符串在另一个字符串中出现的次数。
 * 比如：获取“ ab”在 “abkkcadkabkebfkabkskab” 中出现的次数
 */
package string_algorithm;

import org.junit.Test;

public class t3_Count {
    public int getCount(String mainStr, String subStr) {
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index = 0;

        if (mainLength >= subLength) {
            //way1
            //while ((index = mainStr.indexOf(subStr)) != -1) {
            //    count++;
            //    mainStr = mainStr.substring(index + 1);
            //}
            //way 2
            while ((index = mainStr.indexOf(subStr, index))!= -1 ) {
                    count++;
                    index++;
            }
                //return count;
        }
         return count;
            //return mainStr.split(subStr).length ;

    }
    public int getCount1(String mainStr, String subStr) {
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        //int index = 0;

        return mainStr.split(subStr).length ;
    }
    @Test
    public void test1() {
        String mainStr = "aaa";
        String subStr = "aa";
        System.out.println(getCount(mainStr, subStr));

    }
}
