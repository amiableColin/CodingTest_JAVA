package PROGRAMMERS_LV2;
import java.util.Scanner;

public class long_jump {
    public long solution(int n) {
        if (n < 3) return n;

        long dp[] = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long_jump sol = new long_jump();
        System.out.println(sol.solution(n));
        s.close();
    }
}