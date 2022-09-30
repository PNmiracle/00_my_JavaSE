/**
 * @Author mapKey
 * @Date 7/16/2022 4:23 PM
 * @Since version-1.0
 * @Description 将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反
 * 转为”abfedcg
 */
package string_algorithm;

public class t2_ReverseString {
    //方法一:转换为char[]
    public String reverse(String str, int startIndex, int endIndex) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        char[] arr = str.toCharArray();

        for (int x = startIndex, y = endIndex; x < y; x++, y--) {
            char temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
        return new String(arr);

    }

    public String reverse1(String str, int startIndex, int endIndex) {
        if (str == null) {
            return null;
        }
        //第一部分
        String reverseStr = str.substring(0, startIndex);
        //第二部分 倒着拼接
        for (int i = endIndex; i>= startIndex; i--) {
            reverseStr += str.charAt(i);
        }
        //第三部分
        reverseStr += str.substring(endIndex + 1);
        return reverseStr;
    }
//    方式三,StringBuffer/builder 替换String
    public String reverse2(String str, int startIndex, int endIndex) {
        if (str == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(str.length());
        //第1部分
        builder.append(str.substring(0, startIndex));
        //Part2
        for (int i = endIndex; i>= startIndex; i--) {
            builder.append(str.charAt(i));
        }
        //Part3
        builder.append(str.substring(endIndex + 1));

        return builder.toString();
    }


}
