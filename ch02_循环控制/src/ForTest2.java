import java.util.Scanner;

public class ForTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input The first positive integer.");
        int m = scanner.nextInt();
        System.out.println("Please input The second positive integer.");
        int n = scanner.nextInt();

        int gcd = Math.min(m, n);
        int lcm = Math.max(m, n);
        for (int i = gcd; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println("gdc is " + i);
                break;
            }
        }
        for (int i = lcm; ; i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println("lcm is " + i);
                break;
            }
        }

    }
}
