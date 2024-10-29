package programmers_lv2;

import java.util.Scanner;

public class fibonacci {
    public static int solution(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            dp[i] = (dp[i-1] + dp [i-2]) % 1234567;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt = solution(n);
        System.out.println(cnt);
        s.close();
    }
}