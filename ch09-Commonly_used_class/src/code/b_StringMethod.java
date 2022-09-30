package code;


import org.testng.annotations.Test;

/*
替换：
String replace(char oldChar, char newChar)：返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。
String replace(CharSequence target, CharSequence replacement)：使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
String replaceAll(String regex, String replacement)：使用给定的 replacement 替换此字符串所有匹配给定的正则表达式
的子字符串。
String replaceFirst(String regex, String replacement)：使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。
匹配:
boolean matches(String regex)：告知此字符串是否匹配给定的正则表达式。
切片：
String[] split(String regex)：根据给定正则表达式的匹配拆分此字符串FT。
String[] split(String regex, int limit)：根据匹配给定的正则表达式来拆分此字符串，最多不超过limit个，如果超过了，剩下的全部都放到最后一个元素中。
   */
public class b_StringMethod {
    @Test
    public void test5(){
        String str1 = "abcabc123";
        char[] chars = str1.toCharArray();
        for (char aChar : chars) {
            System.out.println("aChar = " + aChar);
        }
    }
    @Test
    public void test4(){
        String str1 = "北京尚硅谷教育北京北京";
        String replace = str1.replace("北京", "上海");
        System.out.println("str1 = " + str1);
        System.out.println("replace = " + replace);
    }
    @Test
    public void test3(){
        String s1 = "helloworld";
        System.out.println(s1.endsWith("world"));
        String s2 = "wo";
        System.out.println(s1.contains(s2));


    }
    @Test
    public void test2(){
        String s1 = "helloworld";
        String s2 = "HELLOWORLD";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s5 = "abc";
        String s6 = new String("abe");
        System.out.println(s5.compareTo(s6));

        String  s7 = "北京尚硅谷教育";
        String substring = s7.substring(2);
        System.out.println(s7);
        System.out.println("substring = " + substring);

    }
 @Test
 public void test1(){
     String s1 = "helloworld";
     System.out.println(s1.length());
     System.out.println(s1.charAt(0));
     System.out.println(s1.charAt(9));
     //System.out.println(s1.charAt(10));
     System.out.println(s1.isEmpty());

     String s2 = s1.toLowerCase();
 }
}
