package programmers_lv2;
import java.util.Scanner;
public class carpet {
    public static int[] solution(int brown, int yellow) {
        int[] answer = {};
        return answer;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int brown = s.nextInt();
        int yellow = s.nextInt();
        int all_cnt = brown + yellow;
        int answer[] = new int[2];
        for(int height = 3; height <= all_cnt / 3; height++){
            if (all_cnt % height == 0){
                int width = all_cnt / height;
                if((width - 2) * (height - 2) == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }

        System.out.println(answer[0] + " " + answer[1]);
        s.close();
    }
}