package exer;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 练习3:获取文本上字符出现的次数,把数据写入文件
 * <p>
 * 思路：
 * 1.遍历文本每一个字符
 * 2.字符出现的次数存在Map中
 * <p>
 * Map<Character,Integer> map = new HashMap<Character,Integer>();
 * map.put('a',18);
 * map.put('你',2);
 * <p>
 * 3.把map中的数据写入文件
 */
public class b_WordCount {
    @Test
    public void testWordCount() {

        FileReader fr = null;
        BufferedWriter bw = null;
        try {
            HashMap<Character, Integer> map = new HashMap<>();

            fr = new FileReader("dbcp1.txt");
            int c = 0;
            while ((c = fr.read()) != -1) {
                char ch = (char) c;
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            bw = new BufferedWriter(new FileWriter("wordcount.txt"));
            Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
            for (Map.Entry<Character, Integer> entry : entrySet) {
                switch (entry.getKey()) {
                    case ' ':
                        bw.write("空格 = " + entry.getValue());
                        break;
                    case '\t':
                        bw.write("tab键 = " + entry.getValue());
                        break;
                    case '\r':
                        bw.write("回车 = " + entry.getValue());
                        break;
                    case '\n'://
                        bw.write("换行=" + entry.getValue());
                        break;
                    default:
                        bw.write(entry.getKey() + " = " + entry.getValue());
                        break;
                }
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
