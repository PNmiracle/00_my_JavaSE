import java.util.Scanner;

public class HowManyDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Year");
        int year = scanner.nextInt();
        System.out.println("Input Month");
        int month = scanner.nextInt();
        System.out.println("Input Day");
        int day = scanner.nextInt();
        int res = 0;
        switch (month) {
            case 12:
                res += 30;
            case 11:
                res += 31;
            case 10:
                res += 30;
            case 9:
                res += 31;
            case 8:
                res += 31;
            case 7:
                res += 30;
            case 6:
                res += 31;
            case 5:
                res += 30;
            case 4:
                res += 31;
            case 3:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    res += 29;
                } else {
                    res += 28;
                }
            case 2:
                res += 31;
            case 1:
                res += day;
          }
        System.out.println(year + "年"+ month + "月" + day + "日是当年的第" + res + "天");
    }
}
