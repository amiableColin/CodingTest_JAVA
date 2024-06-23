package PROGRAMMERS_LV2;
import java.util.Scanner;
public class jump_and_teleport {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int usage = 0;
        int N = s.nextInt();    // 우리가 얼마나 가야하지? (목표지점)
        while (N > 0) {
            if(N % 2 == 0) {
                N /= 2;
            }
            else {
                N -= 1;
                usage += 1;
            }
        }
        System.out.println(usage);
    }
}