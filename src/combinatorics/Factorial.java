package combinatorics;
// baekjoon 10872
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        if (N < 2) {
            System.out.println(1);
            return;
        }
        int[] dp = new int[N + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] * i;
        }
        System.out.println(dp[N]);
    }
}
