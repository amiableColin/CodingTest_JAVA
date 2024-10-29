package dfs;
import java.util.ArrayList;
import java.util.Scanner;
public class tree_parent_node_11725 {
    static ArrayList<Integer> graph[];
    static boolean[] visited;
    static int[] parent;
    
    static void dfs(int v) {
        for (int i : graph[v]) {
            if(!visited[i]) {
                visited[i] = true;
                parent[i] = v;
                dfs(i);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        graph = new ArrayList[N+1];
        visited = new boolean[N+1];
        parent = new int[N+1];

        for (int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int k = 0; k < N - 1; k++) {
            int i = s.nextInt();
            int j = s.nextInt();
            graph[i].add(j);
            graph[j].add(i);
        }
        dfs(1);

        for(int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }
        s.close();
    }
}