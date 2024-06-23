package DFS;
import java.util.Scanner;
public class bachu_1012 {
    static int M;
    static int N;
    static int K;
    static int[][] grid;
    static boolean[][] visited;
    static int cnt;

    static void dfs(int i, int j) {
        int[] di = {1, -1, 0, 0};
        int[] dj = {0, 0, -1, 1};
        for(int k = 0; k < 4; k++) {
            int i2 = i + di[k];
            int j2 = j + dj[k];
            if((0 <= i2 && i2 < N) && (0 <= j2 && j2 < M) && !visited[i2][j2] && grid[i2][j2] != 0) {
                visited[i2][j2] = true;
                dfs(i2, j2);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int x = 0; x < T; x++) {
            M = s.nextInt();    // 가로 길이 -> 열의 개수
            N = s.nextInt();    // 세로 길이 -> 행의 개수
            K = s.nextInt();
            grid = new int[N][M];
            visited = new boolean[N][M];

            for (int y = 0; y < K; y++) {
                int k = s.nextInt();
                int l = s.nextInt();
                grid[l][k] = 1;
            }
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    if(!visited[i][j] && grid[i][j] != 0) {
                        dfs(i, j);
                        cnt += 1;
                    }
                }
            }
            System.out.println(cnt);
            cnt = 0;
        }
        s.close();
    }
}