package DP;
import java.util.Arrays;
import java.util.Scanner;
public class biggest_increase_partial_sequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.nextLine();
        int data[] = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int dp[] = data.clone();
        for (int i = 1; i < data.length; i++) {
            for (int j = 0; j < i; j++) {
                if(data[j] < data[i]) dp[i] = Math.max(dp[i], dp[j] + data[i]);
            }
        }
        System.out.println(Arrays.stream(dp).max().getAsInt());
        s.close();
    }
}