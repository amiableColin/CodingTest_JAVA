package programmers_lv2;
import java.util.Scanner;

public class next_big_num {
    public static int solution(int n) {
        int one_cnt = Integer.bitCount(n);
        int next_N = n + 1;
        while(true) {
            if (one_cnt == Integer.bitCount(next_N)) {
                return next_N;
            }
            next_N += 1;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        System.out.println(solution(N));
        s.close();
    }
}