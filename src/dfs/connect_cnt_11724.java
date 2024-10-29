package dfs;
import java.util.ArrayList;
import java.util.Scanner;

public class connect_cnt_11724 {
    static int N;
    static int M;
    static ArrayList<Integer>[] graph;
    static int cnt = 0;
    static boolean[] visited;
    static void dfs(int v) {
        for (int i : graph[v]) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        M = s.nextInt();
        graph = new ArrayList[N+1];
        visited = new boolean[N+1];
        for(int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int k = 0; k < M; k++) {
            int i = s.nextInt();
            int j = s.nextInt();
            graph[i].add(j);
            graph[j].add(i);
        }
        for(int i = 1; i < N + 1; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(i);
                cnt += 1;
            }
        }
        System.out.println(cnt);
        s.close();
    }
}