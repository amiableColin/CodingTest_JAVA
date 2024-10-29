package combinatorics;
// baekjoon 11050
import java.util.Arrays;
import java.util.Scanner;
public class BinomialCoefficient {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] N_K = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] dp = new int[N_K[0] + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= N_K[0]; i++) {
            dp[i] = dp[i-1] * i;
        }
        System.out.println(dp[N_K[0]] / (dp[N_K[1]] * dp[N_K[0] - N_K[1]]));
        s.close();
    }
}
