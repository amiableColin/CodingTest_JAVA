package programmers_lv2;
import java.io.IOException;
import java.util.Scanner;
public class presentation_num {
    static int cnt = 0;
    public static int solution(int n) {
        int temp = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = i; j < n + 1; j++) {
                temp += j;
                if (temp >= n) {
                    cnt += (temp == n) ? 1 : 0;
                    temp = 0;
                    break;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        System.out.println(solution(N));
        s.close();
    }
}