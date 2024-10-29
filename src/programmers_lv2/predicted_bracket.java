package programmers_lv2;

public class predicted_bracket {
    // public static boolean odd_check(int a, int b) {
    //     if (Math.abs(a - b) == 1 && Math.max(a, b) % 2 != 0)
    //     return true;
    // }
    public static int solution(int n, int a, int b)
    {
        int answer = 1;
        while (Math.abs(a - b) != 1 || Math.max(a, b) % 2 != 0){
            a = (a % 2 == 0) ? a / 2 : a / 2 + 1;
            b = (b % 2 == 0) ? b / 2 : b / 2 + 1;
            answer += 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // int N = s.nextInt();    // N명의 참가자
        // int A = s.nextInt();    // A가 처음에 배정받는 번호
        // int B = s.nextInt();    // B가 처음에 배정받는 번호
        // System.out.println(solution(N, A, B));
        // s.close();
        predicted_bracket sol = new predicted_bracket();
        System.out.println(sol.solution(8, 4, 5)); // Expected output: 3
        System.out.println(sol.solution(16, 1, 2)); // Expected output: 1
        System.out.println(sol.solution(16, 1, 16)); // Expected output: 4
        // 추가 테스트 케이스
        System.out.println(sol.solution(8, 1, 2)); // Expected output: 1
        System.out.println(sol.solution(8, 2, 3)); // Expected output: 2
        System.out.println(sol.solution(8, 1, 8)); // Expected output: 3
    }
}