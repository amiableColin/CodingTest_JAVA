package greedy;
import java.util.Scanner;
public class coin0_11047 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        int[] coins = new int[N];
        int coin_cnt = 0;
        for (int i = 0; i < coins.length; i++) {
            coins[i] = s.nextInt();
        }
        for(int i = coins.length - 1; i >= 0; i--) {
            coin_cnt += (K / coins[i]);
            K %= coins[i];
        }
        System.out.println(coin_cnt);
        s.close();
    }
}