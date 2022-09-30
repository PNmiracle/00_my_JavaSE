/**
 * @Author mapKey
 * @Date 7/16/2022 8:16 PM
 * @Since version-1.0
 * @Description 4.获取两个字符串中最大相同子串。比如：
 * str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"
 * 提示：将短的那个串进行长度依次递减的子串与较长的串比较。
 */
package string_algorithm;

import org.junit.Test;

import java.util.HashMap;

public class t4_maxSameSubString {
    public String getMaxSameString(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return null;
        }
        String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
        String minStr = (str1.length() < str2.length()) ? str1 : str2;
        int length = minStr.length();
        for (int i = 0; i < length; i++) {
            for (int x = 0, y = length - i; y <= length; x++, y++) {
                String maxSub = minStr.substring(x, y);
                if (maxStr.contains(maxSub)) {
                    return maxSub;
                }
            }
        }

        return null;
    }

    @Test
    public void test1(){
        String str1 = "abcwerthelloyuiodef";
        String str2 = "cvhellobnm";

        System.out.println(getMaxSameString(str1, str2));
    }


    class Solution {
        public String minWindow(String s, String t) {
            HashMap<Character, Integer> window = new HashMap<>();
            HashMap<Character, Integer> need = new HashMap<>();

            for (char c : t.toCharArray()) {
                need.put(c, need.getOrDefault(c, 0) + 1);
            }
            int left = 0, right = 0, len = Integer.MAX_VALUE;
            //valid 变量表示窗口中满足 need 条件的字符个数
            int valid = 0;
            // 记录最小覆盖子串的起始索引及长度
            int start = 0, end = 0;
            while (right < s.length()) {
                // c 是将移入窗口的字符
                char c = s.charAt(right);
                //右移窗口
                right++;
                // 进行窗口内数据的一系列更新
                if (need.containsKey(c)) {
                    window.put(c, window.getOrDefault(c,0) + 1);
                    if (window.get(c).equals(need.get(c))){
                        valid++;
                    }
                }

                // 判断左侧窗口是否要收缩
                while (valid == need.size()) {

                    if (right - left < len) {
                        start = left;
                        end = right;
                        len = right - left;
                    }

                    char d = s.charAt(left);
                    left++;
                    if (need.containsKey(d)) {
                        if (window.get(d).equals(need.get(d))){
                            valid--;
                        }
                        window.put(d,window.getOrDefault(d,0) - 1);
                    }
                }


            }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, end);
        }
    }
}
