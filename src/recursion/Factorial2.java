package recursion;
// baekjoon 27433
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Factorial2 {
    private static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new long[N + 1];
        if (N < 2) {
            System.out.println(1);
            return;
        }
        dp[0] = 1L;
        dp[1] = 1L;
        System.out.println(factorial(N));
        br.close();
    }
    private static long factorial(int n) {
        if (n == 1) return 1;
        else {
            dp[n] = factorial(n - 1) * n;
            return dp[n];
        }
    }
}
