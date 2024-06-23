package DFS;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class safe_area_2468 {
    static int[][] grid;
    static ArrayList<Integer> safe_area = new ArrayList<>();
    static boolean visited[][];
    static int N;

    static int dfs_loop(int threshold) {
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(!visited[i][j] && grid[i][j] >= threshold) {
                    visited[i][j] = true;
                    dfs(i, j, threshold);
                    cnt += 1;
                }
            }
        }
        return cnt;
    }
    static void dfs(int i, int j, int threshold) {
        int[] di = {1, -1, 0, 0};
        int[] dj = {0, 0, -1, 1};
        for(int k = 0; k < 4; k++) {
            int i2 = i + di[k];
            int j2 = j + dj[k];
            if((0 <= i2 && i2 < N) && (0 <= j2 && j2 < N) && !visited[i2][j2] && grid[i2][j2] >= threshold) {
                visited[i2][j2] = true;
                dfs(i2, j2, threshold);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        
        grid = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = s.nextInt();
            }
        }
        
        for(int i = 1; i <= 100; i++) {
            safe_area.add(dfs_loop(i));
            visited = new boolean[N][N];
        }
        Collections.sort(safe_area);

        System.out.println(safe_area.get(safe_area.size() - 1));
        s.close();
    }
}