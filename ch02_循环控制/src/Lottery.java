import java.util.Scanner;

/*
假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，
提示用户输入一个两位数，然后按照下面的规则判定用户是否能赢。
1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金3 000美元。
3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
提示：使用(int)(Math.random() * 90  + 10)产生随机数。
Math.random() : [0,1)  * 90 [0,90) + 10 [10,100)[10,99]

*/
public class Lottery {
    public static void main(String[] args) {
        int ran = (int) (Math.random() * 90 + 10);
        int ranTen = ran / 10;
        int ranUnit = ran % 10;
        System.out.println("Random figure is " + ran);
        System.out.println("Please input a double-digit.");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int xTen = x / 10;
        int xUnit = x % 10;
        if (x == ran) {
            System.out.println("10000");
        } else if (xTen == ranUnit && xUnit == ranTen) {
            System.out.println("3000");
        } else if (xTen == ranTen || xUnit == ranUnit) {
            System.out.println("1000");
        } else if (xTen == ranUnit || xUnit == ranTen) {
            System.out.println("500");
        } else {
            System.out.println("No money.");
        }

        System.out.println("Random figure is " + ran);

    }

}
