package greedy;
import java.util.Scanner;
public class sugar_2839 {
    static int N;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        int[] dp = new int[5001];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 100_000_000;
        }
        dp[3] = 1;
        dp[5] = 1;

        for (int i = 6; i < N+1; i++) {
            dp[i] = Math.min(dp[i-3] + 1, dp[i-5] + 1);
        }
        dp[N] = dp[N] < 100_000_000 ? dp[N] : -1;
        System.out.println(dp[N]);
        s.close();
    }
}