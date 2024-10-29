package greedy;
import java.util.Arrays;
import java.util.Scanner;
public class atm_11399 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] P = new int[N];
        for(int i = 0; i < N; i++) {
            P[i] = s.nextInt();
        }
        Arrays.sort(P);
        for(int i = 1; i < N; i++) {
            P[i] += P[i-1];
        }
        System.out.println(Arrays.stream(P).sum());
        s.close();
    }
}