package exer;

import org.junit.Test;

public class RecursionTest {
    @Test
    public void test1() {
        System.out.println(getSum(100));
        System.out.println(getProduct(100));
        System.out.println(f1(10));
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(fib(i + 1) + "\t");
        }
    }

    public int fib(int n){
        //if (n == 1 || n == 2) return 1;
        if (n < 0) return -1;
        int[] memo = new int[n + 1];
        return helper(memo, n);
    }

    private int helper (int[] memo, int n){
        if (n == 1 || n == 2) return 1;
        if(memo[n] != 0) return memo[n];
        //memo[n] = memo[n - 1] + memo[n - 2]; memo[n - 1] = 0
        memo[n] = helper(memo, n - 1) + helper(memo, n - 2);
        return memo[n];
    }

    public int f1(int n) {
        if (n == 0) return 1;
        if (n == 1) return 4;
        return 2 * f1(n - 1) + f1(n - 2);

    }

    public int getSum(int n) {
        if (n == 1) {
            return 1;
        }
        return getSum(n - 1) + n;
    }

    public int getProduct(int n) {
        if (n == 1) return 1;
        return getSum(n - 1) * n;
    }
}
