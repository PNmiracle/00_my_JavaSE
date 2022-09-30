package code;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class g_SimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        String str = "1990-01-01";
        Scanner scanner = new Scanner(System.in);
        String inputDate = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date date1 = sdf.parse(inputDate);
        long time = date.getTime();
        long time1 = date1.getTime();
        int days = (int)(time1 - time) / 86400000 + 1;
        int opt = days % 5;
        switch (opt) {
            case 1 :
            case 2 :
            case 3 :
                System.out.println("打渔");
                break;
            case 4 :
            case 0 :
                System.out.println("晒网");
                break;

        }
    }
    @Test
    public void test3() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String inputDate = scanner.nextLine();
        String str = "1990-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);
        Date date1 = sdf.parse(inputDate);
        long time = date.getTime();
        long time1 = date1.getTime();
        int days = (int)(time1 - time) / 86400000;
        int opt = days % 5;
        switch (opt) {
            case 1 :
            case 2 :
            case 3 :
                System.out.println("打渔");
                break;
            case 4 :
            case 0 :
                System.out.println("晒网");
                break;

        }
    }
    @Test
    public void test2() throws ParseException {
        String birth = "2022-01-10";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birth);
        System.out.println(date);

        java.sql.Date date1 = new java.sql.Date(date.getTime());
        System.out.println(date1);
    }
    @Test
    public void test1() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();

        Date date = new Date();
        System.out.println(date);
        String format = sdf.format(date);
        System.out.println(format);
        String str = "7/17/23 1:54 PM";
        Date date1 = sdf.parse(str);
        System.out.println(date1);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = sdf1.format(date);
        System.out.println(format1);
    }
}
