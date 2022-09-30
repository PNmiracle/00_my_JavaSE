import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please input your score.");

        int score = scan.nextInt();

        if(score < 0){
            System.out.println("Invalid input.");
        } else if (score == 100) {
            System.out.println("Give you a BMW!");
        } else if (score > 90) {
            System.out.println("An iphone 13");
        } else if (score > 60) {
            System.out.println("An ipad pro");
        } else {
            System.out.println("You stupid!");
        }


    }
}
