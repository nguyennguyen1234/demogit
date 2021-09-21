import java.util.Scanner;

public class Solution {
    /**
     * App.
     *
     * @param args represent everything after the command that run the program
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(Long.MAX_VALUE);
        System.out.println(fibonacci(n));
        scan.close();
    }

    public static long[] memo = new long[1000];

    /**
     * Calculate the nth fibonacci number.
     *
     * @param n is the nth fibonacci
     * @return the nth fibonacci
     */
    public static long fibonacci(long n) {
        long value = 0;
        if (n < 0) {
            return -1;
        } else {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else if (memo[(int) n] != 0) {
                return memo[(int) n];
            } else {
                value = fibonacci(n - 1) + fibonacci(n - 2);
                if (value < 0) {
                    value = Long.MAX_VALUE;
                }
                memo[(int) n] = value;
                return value;
            }
        }
    }
}